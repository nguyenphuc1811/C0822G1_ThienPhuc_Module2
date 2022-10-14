package ss2_arayy_and_loop.exercise;

import java.util.Scanner;

public class AddIndex {
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
        System.out.print("Nhập số cần chèn x = ");
        int x = scanner.nextInt();

        System.out.println("Nhập phần tử muốn chèn là Index = ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= array.length - 1) {
            for (int i = array.length - 1; i >= index; i--) {
                array[i] = array[i - 1];
                if (i == 1) {
                    break;
                }
            }
            array[index] = x;
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
            }
        } else {
            System.out.println("Không chèn được vị trí phần tử vào mảng");
        }
    }
}
