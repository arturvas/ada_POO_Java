import Animals.Bird;
import Animals.Cat;
import Animals.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Tufão", "Marrom com bege", 15, 27, 10, "carinho");

        Cat cat1 = new Cat("Betebas", "Verde com listras pretas", 4);

        Bird bird1 = new Bird("Sofie", "Branco com amarelo", 0.7);

        dog1.sound();
        cat1.sound();
        bird1.sound();

    }
}