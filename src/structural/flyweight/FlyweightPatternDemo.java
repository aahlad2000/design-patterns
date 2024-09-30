package structural.flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("Maruthi 800");
        car1.assignColour("white");
        car1.showDetails();

        System.out.println("************");

        Car car2 = CarFactory.getCar("Maruthi 800");
        car2.assignColour("black");
        car2.showDetails();

        System.out.println("************");

        Car car3 = CarFactory.getCar("Alto K10");
        car3.assignColour("orange");
        car3.showDetails();

    }
}
