package Animals;

public class Dog extends Animal {

//    attributes
    static int numberOfDogs;
    private int tailSize;

//    default constructors

//    additional constructors - add by the dev
    public Dog(String name, String color, int height, double weight, int tailSize, String mood) {
        super(name, color, weight);
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

    @Override
    public void sound() {
        System.out.println("Ouf Ouf");
    }
}
