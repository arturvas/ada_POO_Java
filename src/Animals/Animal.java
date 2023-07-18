package Animals;

public class Animal {
    protected String name;
    protected String color;
    protected int height;
    protected double weight;
    protected String mood;

//    constructor
    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //    methods
    protected void eat(){}

    protected void sleep(){}

    public void sound(){
        System.out.println(" chama na gaita ");
    }

}