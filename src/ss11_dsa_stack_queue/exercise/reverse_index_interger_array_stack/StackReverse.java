package ss11_dsa_stack_queue.exercise.reverse_index_interger_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập 1 mảng có số phần tử:");
        n = Integer.parseInt(scanner.nextLine());
        int[] arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhập số phần tử " + i + "\t");
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            stack.push(arrays[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < n; i++) {
            arrays[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arrays));
    }
}
