import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        private static ArrayList<ClothingItem> clothingItems = new ArrayList<>();
        private static ArrayList<Customer> customers = new ArrayList<>();
        private static ArrayList<Order> orders = new ArrayList<>();

        private static void displayMenu() {
                System.out.println("\n========================================");
                System.out.println(" Clothing Stroe System");
                System.out.println("========================================");
                System.out.println("1. Add Clothing Item");
                System.out.println("2. View All Items");
                System.out.println("3. Add Customer");
                System.out.println("4. View All Customers");
                System.out.println("0. Exit");
                System.out.println("========================================");
                System.out.print("Enter your choice: ");
        }

        private static void addClothItem() {
                System.out.println("\n--- Add CLothing Item ---");
                // Ask for each field
                System.out.print("Enter item material: ");
                String material = scanner.nextLine(); // Read string
                System.out.print("Enter price (KZT): ");
                double price = scanner.nextDouble(); // Read double
                scanner.nextLine(); // Consume newline
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Is available? (true/false): ");
                boolean available = scanner.nextBoolean();
                System.out.print("Amount of item: ");
                int amount = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                // Create new object with user's data
                ClothingItem item = new ClothingItem(clothingItems.size()+1, price, category, material, available, amount);
                // Add to ArrayList
                clothingItems.add(item);
                System.out.println("\n Menu item added successfully!");
        }

        private static void viewAllItems(){
                if (clothingItems.isEmpty()){
                        System.out.println("Array is empty");
                }else{
                for(int ind = 0; ind < clothingItems.size(); ind++){
                        System.out.println(ind+1 + ":" + clothingItems.get(ind));
                }}
        }

        private static void addCustomer() {
                System.out.println("\n--- Add Customer ---");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter discount: ");
                int discount = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter phone Number: ");
                String phone_number = scanner.nextLine();

                Customer customer = new Customer(name, customers.size()+1, discount, phone_number);
                customers.add(customer);
                System.out.println("\n Customer added successfully!");
        }

        private static void viewAllCustomers(){
                if (customers.isEmpty()){
                        System.out.println("Array is empty");
                }else{
                for(int ind = 0; ind < customers.size(); ind++){
                        System.out.println(ind+1 + ":" + customers.get(ind));
                }}
        }


        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args){
                boolean running = true;

                while(running){
                        displayMenu();
                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                                case 1:
                                        addClothItem();
                                        break;
                                case 2:
                                        viewAllItems();
                                        break;
                                case 3:
                                        addCustomer();
                                        break;
                                case 4:
                                        viewAllCustomers();
                                        break;
                                case 0:
                                        running = false;
                                        break;
                                default: System.out.println("Wrong entered option, try again");
                        }
                        if (running){
                                System.out.println("\nPress Enter to continue...");
                                scanner.nextLine();
                        }
                }
                scanner.close();



        }
}
