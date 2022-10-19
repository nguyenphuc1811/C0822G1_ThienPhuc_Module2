package ss11_dsa_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập 1 số để đổi sang nhị phân: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }
        System.out.print("Hệ nhị phân là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
