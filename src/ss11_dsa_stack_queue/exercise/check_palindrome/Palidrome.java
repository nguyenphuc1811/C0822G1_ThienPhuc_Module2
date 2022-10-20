package ss11_dsa_stack_queue.exercise.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palidrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi để kiểm tra đó có phải là palidrome k");
        String string = scanner.nextLine();
        boolean check = true;
        String[] arr = string.split("");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            queue.offer(arr[i]);
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("chuỗi vừa nhập là chuỗi Palindrome");
        } else {
            System.out.println("chuỗi vừa nhập không phải là chuỗi Palindrome");
        }
    }
}
