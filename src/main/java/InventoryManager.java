import java.util.*;

public class InventoryManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> inventory = new ArrayList<>();

    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        inventory.add(new Product(id, name, quantity));
        System.out.println("Product added successfully.");
    }

    static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n--- Inventory List ---");
        for (Product p : inventory) {
            p.display();
        }
    }

    static void updateStock() {
        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();
        for (Product p : inventory) {
            if (p.id == id) {
                System.out.print("Enter new quantity: ");
                p.quantity = scanner.nextInt();
                System.out.println("Stock updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = scanner.nextInt();
        for (Product p : inventory) {
            if (p.id == id) {
                inventory.remove(p);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void checkLowStock() {
        boolean found = false;
        for (Product p : inventory) {
            if (p.quantity < 5) {
                if (!found) {
                    System.out.println("\n--- Low Stock Alert ---");
                    found = true;
                }
                p.display();
            }
        }
        if (!found) {
            System.out.println("All products are sufficiently stocked.");
        }
    }
}