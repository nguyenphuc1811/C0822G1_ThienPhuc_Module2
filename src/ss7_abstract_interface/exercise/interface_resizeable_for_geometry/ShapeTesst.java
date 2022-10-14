package ss7_abstract_interface.exercise.interface_resizeable_for_geometry;

public class ShapeTesst {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
