package ayush.springframework.petclinic.services;

import ayush.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner ,Long>{
    Owner findByLastName(String lastName);

}
