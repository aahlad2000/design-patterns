package structural.decorator;

public class SimpleCoffee implements Coffee{

    //Defining a concrete class
    @Override
    public String getDescription() {
        return "This is simple coffee";
    }

    @Override
    public double getPrice() {
        return 100.50;
    }
}
