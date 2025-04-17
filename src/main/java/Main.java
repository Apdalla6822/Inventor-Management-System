import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = InventoryManager.scanner;
        int choice;
        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Update Stock");
            System.out.println("4. Remove Product");
            System.out.println("5. Check Low Stock");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> InventoryManager.addProduct();
                case 2 -> InventoryManager.displayInventory();
                case 3 -> InventoryManager.updateStock();
                case 4 -> InventoryManager.removeProduct();
                case 5 -> InventoryManager.checkLowStock();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}