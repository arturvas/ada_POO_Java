package Animals;

public class Dog {

//    attributes
    static int numberOfDogs;
    private String name;
    private String color;
    private int height;
    private double weight;
    private int tailSize;
    private String mood;

//    default constructors
    public Dog(){}

//    additional constructors - add by the dev
    public Dog(String name, String color, int height, double weight, int tailSize, String mood) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.tailSize = tailSize;
        this.mood = mood;

        numberOfDogs ++;
    }

    //    methods
    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

    public static void setNumberOfDogs(int numberOfDogs) {
        Dog.numberOfDogs = numberOfDogs;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

    public String getMood() {
        return mood;
    }

//    Setting a method

    public void eat(){}

    public void bark(){
        System.out.println("Au! Au!");
    }

    public String take(){
        return "bolinha";
    }

//    Action defined
    public String interact(String action){
        switch (action) {
            case "carinho": this.mood = "feliz"; break;
            case "comida": this.mood = "muito feliz"; break;
            case "grito": this.mood = "triste"; break;
            default: this.mood = "neutro"; break;
        }
        return mood;
    }

}
