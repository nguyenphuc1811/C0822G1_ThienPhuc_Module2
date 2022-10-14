package ss6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * getHeight();
    }

    public void setAll(double radius, double height, String color) {
        super.setColor(color);
        super.setRadius(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getRadius() * 2 * Math.PI * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " Radius= " + getRadius() + " Color= " + getColor() +
                " height=" + height + " Area= " + getArea() + " Volume= " + getVolume() +
                '}';
    }
}
