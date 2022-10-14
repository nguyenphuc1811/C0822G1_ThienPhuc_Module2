package ss2_arayy_and_loop.exercise;

import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng số nguyên tố: ");
        Scanner scanner = new Scanner(System.in);
        int count = 0, n = 2;
        int number = scanner.nextInt();
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(n);
            }
            n++;
        }
    }
}
