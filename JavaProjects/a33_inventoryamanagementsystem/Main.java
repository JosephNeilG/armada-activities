package a33_inventoryamanagementsystem;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, String> products = new HashMap<>();

    public static void main(String[] args) {

        // Displays menu options
        displayOptions();

        // Infinite loop for menu-driven operations
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Switch-case to handle user's choice
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProductName();
                    break;
                case 3:
                    getProductNameById();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    displayInventory();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-6 only.");
                    break;
            }

        }
    }

    /** Displays the available options for the user. */
    private static void displayOptions() {
        System.out.println("1. Add Product");
        System.out.println("2. Update Product Name");
        System.out.println("3. Find Product by ID");
        System.out.println("4. Remove Product");
        System.out.println("5. Display Inventory");
        System.out.println("6. Exit");
    }

    /**
     * Adds a new product to the inventory. Prompts user to enter valid product ID,
     * and name.
     */
    private static void addProduct() {
        // Get valid product ID
        int productId = validateProductId();

        // Get valid product name
        String productName = validateProductName();

        // Add product to inventory
        products.put(productId, productName);
        System.out.println("Product added!\n");
    }

    /**
     * Validates the product ID.
     * Ensures that the ID is positive and unique.
     * 
     * @return A valid product ID.
     */
    private static int validateProductId() {
        int productId;

        do {
            System.out.print("\nEnter Product ID: ");
            productId = scanner.nextInt();
            scanner.nextLine();

            // Check if product ID is positive
            if (productId < 0) {
                System.out.println("Invalid product ID. Please enter a positive value.");
            }
            // Check if product ID already exists in inventory
            else if (products.containsKey(productId)) {
                System.out.println("Product ID already exists. Please enter a unique ID.");
            }
        } while (productId < 0 || products.containsKey(productId));

        return productId;
    }

    /**
     * Validates the product name.
     * Ensures that the product name is not empty.
     * 
     * @return A valid product name.
     */
    private static String validateProductName() {
        String productName;

        do {
            System.out.print("Enter Product Name: ");
            productName = scanner.nextLine().trim();

            // Check if product name is empty
            if (productName.isEmpty()) {
                System.out.println("Product name cannot be empty. Please enter a product name.\n");
            }
        } while (productName.isEmpty());

        return productName;
    }

    /**
     * Updates the name of a product in the inventory.
     * Prompts the user for the product ID and new product name,
     * and updates the product's name if it exists.
     */
    private static void updateProductName() {
        if (checkIfProductsExist("update a product's name")) {
            System.out.print("Enter Product ID: ");

            int productId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter new Product Name: ");
            String newProductName = scanner.nextLine();

            // Update product name if the product exists
            if (products.containsKey(productId)) {
                products.put(productId, newProductName);
                System.out.println("Product updated!\n");
            }
        }
    }

    /**
     * Retrieves and displays the product name by ID.
     * Prompts the user for the product ID and shows the corresponding product name.
     */
    private static void getProductNameById() {
        if (checkIfProductsExist("find a product by ID")) {
            System.out.print("Enter Product ID: ");

            int productId = scanner.nextInt();
            scanner.nextLine();

            // Display product name if the product exists
            if (products.containsKey(productId)) {
                System.out.println("Product Found: " + products.get(productId) + "\n");
            } else {
                System.out.println("No product found with the given ID.\n");
            }
        }
    }

    /**
     * Removes a product from the inventory.
     * Prompts the user for the product ID and removes it.
     */
    private static void removeProduct() {
        if (checkIfProductsExist("remove a product")) {
            System.out.print("Enter Product ID to remove: ");

            int productId = scanner.nextInt();
            scanner.nextLine();

            // Remove product if it exists
            if (products.containsKey(productId)) {
                products.remove(productId);
                System.out.println("Product removed!\n");
            } else {
                System.out.println("No product found with the given ID.\n");
            }
        }
    }

    /** Displays the inventory of products. */
    private static void displayInventory() {
        if (checkIfProductsExist("display products")) {
            System.out.println("Current Inventory:");

            for (Integer key : products.keySet()) {
                System.out.println(key + " - " + products.get(key));
            }
            System.out.println();
        }
    }

    /**
     * Checks if the product inventory is empty.
     * Displays an error message if no products exist in the inventory.
     *
     * @param action The action the user is attempting.
     * @return true if products exist, false otherwise.
     */
    private static boolean checkIfProductsExist(String action) {
        boolean isProductsExists = !products.isEmpty();

        if (!isProductsExists) {
            System.out.println("Product inventory is empty. Cannot " + action + ".\n");
        }

        return isProductsExists;
    }
}