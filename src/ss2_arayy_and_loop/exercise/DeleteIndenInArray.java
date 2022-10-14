package ss2_arayy_and_loop.exercise;

import java.util.Scanner;

public class DeleteIndenInArray {
    public static void main(String[] args) {
        System.out.print("Nhập mảng có độ dài n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số nguyên vào phần tử i = " + i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }
        System.out.println("Xóa phần tử có trong mảng: ");
        int x = scanner.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == x) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length -1] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }
    }
}

