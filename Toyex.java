public class Toyex {
    public static void main(String[] args) {
        Toy toy = new Toy("Barbie", 180.0);
        toy.getInfo();

        LightSaber lightSaber = new LightSaber("Light saber", 270.0, "Blue", 55);
        lightSaber.getInfo();

    }
}

class Toy {
    public String name;
    public double weight;
    // default constructor
    public Toy() {
        name = "";
        weight = 0.0;
    }
    // parameterized constructor
    public Toy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // prints all the values of the attributes
    public void getInfo(){
        System.out.println("Toy name is "+ name + " and the weight is "+ weight +"g");
    }


}

class LightSaber extends Toy {
    public String color;
    public int length;

    // create the constructor
    public LightSaber(String name, double weight, String color, int length) {
        super(name, weight);
        this.color = color;
        this.length = length;
    }
    //    create a method called turnOn
    public void turnOn(){
        System.out.println("The light saber is turn on");
    }

    public void getInfo(){
        System.out.println("The name is "+ name + " and weight is "+ weight+ "g");
        System.out.println("The color is "+ color + " and length is "+ length +"mm");
    }


}


