import Animals.Dog;

public class Main {

    public static void main(String[] args) {

//        way to set an object:
//        Dog dog1;
//        dog1 = new Dog();

//        commonly used:
        Dog dog1 = new Dog();

        dog1.name = "Tufão";
        dog1.color = "Marron com branco";
        dog1.height = 17;
        dog1.weight = 27;
        dog1.tailSize = 10;

        dog1.bark();
        System.out.println(dog1.name + " pegou uma " + dog1.take());

        System.out.println(dog1.name + " está " + dog1.interact("nada"));
        System.out.println(dog1.name + " está " + dog1.interact("carinho"));
        System.out.println(dog1.name + " está " + dog1.interact("comida"));

    }
}