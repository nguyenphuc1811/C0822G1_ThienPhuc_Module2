package ss11_dsa_stack_queue.exercise.reverse_index_interger_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackReverseString {
    public static void main(String[] args) {
        Stack<String> wstack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        String mWord = scanner.nextLine();
        String[] arr = mWord.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            wstack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = wstack.pop();
        }
        System.out.println("mWord = " + Arrays.toString(arr));
    }
}
