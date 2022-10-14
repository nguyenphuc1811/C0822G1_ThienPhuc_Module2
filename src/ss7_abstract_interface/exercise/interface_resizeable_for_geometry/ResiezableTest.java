package ss7_abstract_interface.exercise.interface_resizeable_for_geometry;

public class ResiezableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 2);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.resize((int) (Math.random() * (100) + 1));
            System.out.println("After augument. " + shape + '\n');
        }
    }
}
