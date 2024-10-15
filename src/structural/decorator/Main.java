package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(STR."DESC: \{coffee.getDescription()} and PRICE: \{coffee.getPrice()}");

        coffee = new MilkDecorator(coffee);
        System.out.println(STR."DESC: \{coffee.getDescription()} and PRICE: \{coffee.getPrice()}");

        coffee= new SugarDecorator(coffee);
        System.out.println(STR."DESC: \{coffee.getDescription()} and PRICE: \{coffee.getPrice()}");

    }
}
