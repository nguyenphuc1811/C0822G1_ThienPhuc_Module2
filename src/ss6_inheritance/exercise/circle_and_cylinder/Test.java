package ss6_inheritance.exercise.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder();
        cylinder.setAll(5,7,"red");
        System.out.println(cylinder.toString());
    }
}
