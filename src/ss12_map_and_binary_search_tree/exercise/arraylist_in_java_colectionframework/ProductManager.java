package ss12_map_and_binary_search_tree.exercise.arraylist_linkedlist_in_java_colectionframework;

import ss12_map_and_binary_search_tree.exercise.arraylist_linkedlist_in_java_colectionframework.Product;

import java.util.Scanner;

public class ProductManager<E> {
    private static final Scanner scanner = new Scanner(System.in);

    public static void addProduct() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        int id = Product.products.get(Product.products.size() - 1).getId() + 1;
        Product product = new Product(name, price);
        product.setId(id);
        Product.products.add(product);
    }

    public static void editProduct() {
        System.out.println("Nhập id cần chỉnh sửa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Product.products.size(); i++) {
            if (Product.products.get(i).getId() == id) {
                System.out.println("Nhập tên cần chỉnh sửa:  ");
                Product.products.get(i).setName(scanner.nextLine());
                System.out.println("Nhập giá tiền cần chỉnh sửa:  ");
                Product.products.get(i).setPrice(Integer.parseInt(scanner.nextLine()));
            }
        }
        displayListProduct();
    }

    public static void deleteProduct() {
        int indexDelete = -1;
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Product.products.size(); i++) {
            if (Product.products.get(i).getId() == id) {
                indexDelete = i;
            }
        }
        if (indexDelete != -1) {
            Product.products.remove(indexDelete);
        } else {
            System.out.println("Không có id= " + id);
        }
        displayListProduct();
    }

    public static void displayListProduct() {
        for (int i = 0; i < Product.products.size(); i++) {
            System.out.printf("id= %d \t name= %s \t price= %d \n", Product.products.get(i).getId(),
                    Product.products.get(i).getName(), Product.products.get(i).getPrice());
        }
    }

    public static void searchProduct() {
        System.out.println("Nhập tên Product cần tìm kiếm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < Product.products.size(); i++) {
            if (Product.products.get(i).getName().equals(name)) {
                System.out.printf("id= %d \t price= %d \n", Product.products.get(i).getId(),
                        Product.products.get(i).getPrice());
            }
        }
    }

}
