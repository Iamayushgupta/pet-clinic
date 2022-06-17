package ayush.springframework.petclinic.services.map;

import ayush.springframework.petclinic.model.Vet;
import ayush.springframework.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet , Long> {


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
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
