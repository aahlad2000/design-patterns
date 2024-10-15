package structural.decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffeeDecorator;

    public CoffeeDecorator(Coffee coffeeDecorator){
        this.coffeeDecorator = coffeeDecorator;
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription();
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice();
    }
}
