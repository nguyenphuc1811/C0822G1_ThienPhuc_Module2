package ss12_map_and_binary_search_tree.exercise.arraylist_linkedlist_in_java_colectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    int id;
    String name;
    int price;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static ArrayList<Product> products = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Tủ lạnh", 200);
        Product product2 = new Product(2, "Tủ gỗ", 500);
        Product product3 = new Product(3, "Tủ sắt", 600);
        Product product4 = new Product(4, "Tủ vàng", 1100);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
    }
}
