package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> carMap = new HashMap<>();

    public static Car getCar(String model){
        Car car = carMap.get(model);
        if(car == null){
            car = new ConcreteCar(model);
            carMap.put(model, car);
            System.out.println(STR."Created new car model: \{model}");
        } else{
            System.out.println(STR."Resuing existing car model: \{model}");
        }
        return car;
    }
}
