package Animals;

public class Cat extends Animal {

//    attributes
    static int numberOfCats;

//    constructor
    public Cat(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void sound() {
        System.out.println("Miau Miau nigga");
    }
}
