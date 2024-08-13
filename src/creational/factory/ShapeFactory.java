package creational.factory;

public class ShapeFactory {
    public Shape createShape(String shapeType){
        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Sqaure();
            default -> null;
        };
    }
}
