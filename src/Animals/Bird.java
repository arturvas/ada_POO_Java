package Animals;

public class Bird {

//    attributes
    static int numberOfBirds;
    private String name;
    private String color;
    private int height;
    private double weight;
    private String mood;

//    constructors
    public Bird(String name, String color, int height, double weight, String mood) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.mood = mood;

        numberOfBirds ++;
    }

//    comentario branch

//    methods
    void eat(){}

    void sleep(){}

    void sound(){
        System.out.println("Piu Piu");
    }

}
