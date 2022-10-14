package ss5_access_modifier_and_static.exercise.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        Circle circle = new Circle(Double.parseDouble(scanner.nextLine()));
        System.out.print("Nhập màu: ");
        circle.setColor(scanner.nextLine());
        System.out.println("Diện tích hình tròn là " + circle.getArea() + " màu: " + circle.getColor());
    }

}
