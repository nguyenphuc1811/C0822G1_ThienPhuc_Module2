package ss7_abstract_interface.exercise.interface_resizeable_for_geometry;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(4, "indigo", false);
        System.out.println(circle);

        circle.resize(20);
        System.out.println(circle);
    }
}
