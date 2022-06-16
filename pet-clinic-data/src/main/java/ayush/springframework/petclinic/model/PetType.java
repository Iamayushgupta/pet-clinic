package ayush.springframework.petclinic.model;

public class PetType extends BaseEntity{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
