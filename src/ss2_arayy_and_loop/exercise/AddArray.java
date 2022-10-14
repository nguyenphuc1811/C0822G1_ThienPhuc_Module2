package ss2_arayy_and_loop.exercise;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        System.out.print("Nhập mảng 1 có độ dài n = ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] array1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập số nguyên vào phần tử i là " + i + " = " );
            array1[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Nhập mảng 2 có độ dài n = ");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên vào phần tử i là " + i + " = " );
            array2[i] = scanner.nextInt();
        }
        System.out.println();
        int[] newArray = new int[m + n];
        for (int i = 0; i < m; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < n; i++) {
            newArray[i + m] = array2[i];
        }
        System.out.print("Mảng vừa nhập là: \t");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
}
