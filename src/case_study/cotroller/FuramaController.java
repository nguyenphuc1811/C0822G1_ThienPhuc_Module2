package case_study.cotroller;

import java.util.Scanner;

public class FuramaController {
    int selection;
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("\tMenu\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n " +
                    "Vui lòng nhập số 1-6 để chọn: "
            );

            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.out.println("EXIT");
                    break;
                default:
            }
        } while (selection != 6);
    }

    public void displayEmployeeManagement() {

        System.out.println("1. \t	Display list employees\n" +
                "2. \t	Add new employee\n" +
                "3	\tDelete employee\n" +
                "4 \t	Edit employee\n" +
                "5 \t	Return main menu \n"
        );
        do {
            selection = Integer.parseInt(scanner.nextLine());
        } while (selection != 5);
    }

    public void displayCustomerManagement() {

        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        do {
            selection = Integer.parseInt(scanner.nextLine());
        } while (selection != 4);
    }

    public void displayFacilityManagement() {
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        do {
            selection = Integer.parseInt(scanner.nextLine());
        } while (selection != 4);
    }

    public void displayBookingManagement() {
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tReturn main menu\n");
        do {
            selection = Integer.parseInt(scanner.nextLine());
        } while (selection != 3);
    }

    public void displayPromotionManagement() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        do {
            selection = Integer.parseInt(scanner.nextLine());
        } while (selection != 3);
    }
}
