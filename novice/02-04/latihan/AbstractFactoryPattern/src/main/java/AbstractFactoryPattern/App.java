/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AbstractFactoryPattern;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // get an object of Shape Rounded Rectangle
        Shape rectangleShapeRounded = shapeFactory.getShape("RECTANGLE");
        // call draw method of Shape Rectangle
        rectangleShapeRounded.draw();

        // get an object of Shape Rounded Square
        Shape squareShapeRounded = shapeFactory.getShape("SQUARE");
        // call draw method of Shape Square
        squareShapeRounded.draw();

        // ============================

        // get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        // get an object of Shape Rectangle
        Shape rectangleShape = shapeFactory1.getShape("ReCTANGLE");
        // call draw method of Shape Rectangle
        rectangleShape.draw();

        // get an object of Shape Square
        Shape squareShape = shapeFactory.getShape("Square");
        // call draw method of Shape Square
        squareShape.draw();
    }
}
