package ss4_class_object.exercise.QuadraticEquation;

public class FindEquation {

    private double a;
    private double b;
    private double c;

    public FindEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return ((-this.b + Math.sqrt(getDiscriminant())) / 2 / this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return ((-this.b - Math.pow(getDiscriminant(), 2)) / 2 / this.a);
        } else {
            return 0;
        }
    }
}
