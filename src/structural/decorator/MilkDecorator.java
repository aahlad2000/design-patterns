package structural.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return STR."\{coffeeDecorator.getDescription()} with Milk";
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice() + 32;
    }
}
