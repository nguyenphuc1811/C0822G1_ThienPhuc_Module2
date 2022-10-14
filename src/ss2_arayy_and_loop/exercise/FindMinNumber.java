package ss2_arayy_and_loop.exercise;

import java.util.Scanner;

public class FindMinNumber {
    public static void main(String[] args) {
        System.out.print("Nhập mảng 1 có độ dài size = ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập số nguyên vào phần tử i là " + i + " = ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.println("Min = " + min + " tại vị trí array[" + i + "]");
            }
        }
    }
}
