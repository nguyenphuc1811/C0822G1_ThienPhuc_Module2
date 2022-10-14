package ss6_inheritance.exercise.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(3,4);
        System.out.println(point2D);
        Point3D point3D = new Point3D(5,6,7);
        point3D.setXYZ(1,3,4);
        System.out.println(point3D);
    }
}
