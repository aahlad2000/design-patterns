package structural.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return STR."\{coffeeDecorator.getDescription()} with Sugar";
    }

    @Override
    public double getPrice(){
        return coffeeDecorator.getPrice() + 87.9;
    }
}
