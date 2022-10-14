package ss5_access_modifier_and_static.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    protected String color = "red";

    Circle(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
