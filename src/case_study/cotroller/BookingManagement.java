package case_study.cotroller;

import java.util.Scanner;

public class BookingManagement {
    public static void display() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tReturn main menu");
        do {
            selection = Integer.parseInt(scanner.nextLine());
            if (selection == 4) {
                FuramaController.display();
            } else if (selection > 4 || selection < 1) {
                System.out.println("nhap lai tu 1 - 4");
            }
        } while (selection > 4 || selection < 1);
    }
}
