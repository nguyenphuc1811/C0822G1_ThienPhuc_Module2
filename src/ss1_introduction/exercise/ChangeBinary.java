package ss1_introduction.exercise;

import java.util.Scanner;

public class ChangeBinary {
    public static void main(String[] args) {
        System.out.println("Nhập USD bạn muốn đổi ra VND");
        Scanner scanner = new Scanner(System.in);
        double usd,vnd;
        usd = scanner.nextDouble();
        vnd = usd*23000;
        System.out.println(usd +" USD = " + vnd + " VND");
    }
}
