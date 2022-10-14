package ss7_abstract_interface.exercise.interface_colorable;

public class ColorableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(4);
        shapes[1] = new Rectangle(3,4,"red",false);
        shapes[2] = new Square();
        shapes[3] = new Circle(5);

        for (Shape shape : shapes) {
            System.out.println("Diện tích= " + shape.getArea() +'\n' + shape.toString());
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println();
        }
    }
}
