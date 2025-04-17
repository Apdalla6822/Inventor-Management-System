
import java.util.*;

public class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Qty: " + quantity);
    }
}
