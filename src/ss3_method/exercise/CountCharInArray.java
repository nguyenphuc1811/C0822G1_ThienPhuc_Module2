package ss3_method.exercise;

import java.util.Scanner;

public class CountCharInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự bất kì");
        String str = scanner.nextLine();
        System.out.print("Nhập kí tự muốn tìm: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Ký tự " + character + " xuất hiện " + count + " lần");
    }
}
