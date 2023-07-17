import Animals.Dog;

public class Main {

    public static void main(String[] args) {

//        way to set an object:
//        Dog dog1;
//        dog1 = new Dog();

//        commonly used:
        Dog dog1 = new Dog();

        dog1.setName("Tufão");
        dog1.setColor("Marron com branco");
        dog1.setHeight(17);
        dog1.setWeight(27);
        dog1.setTailSize(10);

        dog1.bark();
        System.out.println(dog1.getName() + " pegou uma " + dog1.take());

        System.out.println(dog1.getName() + " está " + dog1.interact("grito"));
        System.out.println(dog1.getName() + " está " + dog1.interact("nada"));
        System.out.println(dog1.getName() + " está " + dog1.interact("carinho"));
        System.out.println(dog1.getName() + " está " + dog1.interact("comida"));

    }
}