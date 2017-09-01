package creational.abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {

        Factory shapeFactory = getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Triangle");
        shape3.draw();

        Factory colorFactory = getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }

    static Factory getFactory(String type){
        Factory factory = null;

        if (type.equalsIgnoreCase("shape"))
            factory = new ShapeFactory();
        else if (type.equalsIgnoreCase("color"))
            factory = new ColorFactory();

        return factory;
    }
}
abstract class Factory{
    abstract Shape getShape(String type);
    abstract Color getColor(String type);
}
class ShapeFactory extends Factory{
    @Override
    Shape getShape(String type) {
        Shape shape = null;

        if (type.equalsIgnoreCase("circle"))
            shape = new Circle();
        else if (type.equalsIgnoreCase("rectangle"))
            shape = new Rectangle();
        else if (type.equalsIgnoreCase("triangle"))
            shape = new Triangle();

        return shape;
    }

    @Override
    Color getColor(String type) {
        return null;
    }
}
class ColorFactory extends Factory{
    @Override
    Shape getShape(String type) {
        return null;
    }

    @Override
    Color getColor(String type) {
        Color color = null;

        if (type.equalsIgnoreCase("red"))
            color = new Red();
        else if (type.equalsIgnoreCase("blue"))
            color = new Blue();
        else if (type.equalsIgnoreCase("green"))
            color = new Green();

        return color;
    }
}
interface Shape{
    void draw();
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw circle...");
    }
}
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw rectangle...");
    }
}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw triangle...");
    }
}
interface Color{
    void fill();
}
class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Fill red...");
    }
}
class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Fill blue...");
    }
}
class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Fill green...");
    }
}