package creational.factory;

public class FactoryPattern {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.createShape("circle");
        Shape rectangleShape = shapeFactory.createShape("rectangle");
        Shape squareShape = shapeFactory.createShape("square");

        circleShape.calculateArea();
        rectangleShape.calculateArea();
        squareShape.calculateArea();
    }
}
