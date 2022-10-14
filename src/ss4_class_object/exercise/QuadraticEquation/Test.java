package ss4_class_object.exercise.QuadraticEquation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the equation is 2ax2+b=c");
        System.out.print("enter a= ");
        double a = scanner.nextDouble();
        System.out.print("enter b= ");
        double b = scanner.nextDouble();
        System.out.print("enter c= ");
        double c = scanner.nextDouble();
        FindEquation equation1 = new FindEquation(a, b, c);

        if (equation1.getB() == equation1.getC()) {
            System.out.println("The equation has unlimited roots");
        } else if (equation1.getDiscriminant() > 0 && equation1.getA() > 0) {
            System.out.println("The equation has two roots x1= " + equation1.getRoot1()
                    + " x2= " + equation1.getRoot2());
        } else if (equation1.getDiscriminant() == 0) {
            System.out.println("the equation há 1 roots x= " + equation1.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
