package structural.flyweight;

public class ConcreteCar implements Car{
    private final String model;
    private String colour;

    public ConcreteCar(String model){
      this.model = model;
    }

    @Override
    public void assignColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void showDetails(){
        System.out.println(STR."Car Model : \{model}, colour : \{colour}");
    }
}
