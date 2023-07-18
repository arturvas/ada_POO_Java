package Animals;

public class Bird extends Animal{

//    attributes
    static int numberOfBirds;

//    constructors
    public Bird(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public void sound() {
        System.out.println("o pintinho piu");
    }
}
