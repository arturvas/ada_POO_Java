package Store;

import Animals.Animal;
import Animals.Dog;

public class Petshop {

    public void giveBath (Animal animal){
        animal.setMood("limpo e cheiroso");
    }

    public void shave(Dog dog){
        dog.setMood("tosado");
    }

    public void leaveAtMotel(Animal animal){
        animal.setMood("saudade");
    }

}
