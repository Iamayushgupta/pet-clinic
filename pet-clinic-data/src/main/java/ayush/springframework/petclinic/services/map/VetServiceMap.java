package ayush.springframework.petclinic.services.map;

import ayush.springframework.petclinic.model.Speciality;
import ayush.springframework.petclinic.model.Vet;
import ayush.springframework.petclinic.services.CrudService;
import ayush.springframework.petclinic.services.SpecialityService;
import ayush.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialityService specialtyService;

    public VetServiceMap(SpecialityService specialtyService) {
        this.specialtyService = specialtyService;
    }
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
