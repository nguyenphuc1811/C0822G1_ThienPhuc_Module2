package ss3_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hàng: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cột: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[][] array = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập số vào phần tử [" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.print("Nhập cột muốn tính tổng:");
        int col = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < m; i++) {
            sum += array[i][col - 1];
        }
        System.out.println("Tổng của cột " + col + " là = " + sum);
    }
}
