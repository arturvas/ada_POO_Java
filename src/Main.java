import Animals.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Tufão", "Marrom com bege", 15, 27, 10, "carinho");
        Dog dog2 = new Dog("Bela", "Caramelo", 18, 35, 11, "nada");

        System.out.println(dog1.getName() + " pegou uma " + dog1.take());

        System.out.println(dog2.getName() + " está " + dog2.interact("grito"));
        System.out.println(dog2.getName() + " está " + dog2.interact("nada"));
        System.out.println(dog1.getName() + " está " + dog1.interact("carinho"));
        System.out.println(dog1.getName() + " está " + dog1.interact("comida"));

    }
}