package Animals;

public class Cat {

//    attributes
    static int numberOfCats;
    private String name;
    private String color;
    private int height;
    private double weight;
    private String mood;

//    constructors
    public Cat(String name, String color, int height, double weight, String mood) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.mood = mood;

        numberOfCats ++;
    }

//    methods
    void eat(){}

    void sleep(){}

    void sound(){
        System.out.println("Miau Miau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
