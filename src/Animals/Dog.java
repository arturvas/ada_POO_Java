package Animals;

public class Dog {

    public String name;
    public String color;
    public int height;
    public double weight;
    public int tailSize;

    public String mood;

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
        if (action.equals("comida")){
            this.mood = "muito feliz";
        } else if (action.equals("carinho")) {
            this.mood = "feliz";
        } else if (action.equals("grita")) {
            this.mood = "triste";
        } else{
            this.mood = "quieto";
        }
        return mood;
    }

}
