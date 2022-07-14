package ayush.springframework.petclinic.services.map;

import ayush.springframework.petclinic.model.Speciality;
import ayush.springframework.petclinic.services.SpecialitiesService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

}
