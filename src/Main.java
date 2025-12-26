import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        private static ArrayList<ClothingItem> clothingItems = new ArrayList<>();
        private static ArrayList<Customer> customers = new ArrayList<>();
        private static ArrayList<Order> orders = new ArrayList<>();

        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args){

                int customer_id_counter = 0;
                int order_id_counter = 0;
                int cloth_id_counter = 0;

                clothingItems.add(new ClothingItem(cloth_id_counter += 1, 300, "T-shirt", "Silk", true, 2));
                clothingItems.add(new ClothingItem(cloth_id_counter += 1,400, "Braces", "Silk", false, 3));
                clothingItems.add(new ClothingItem(cloth_id_counter += 1,500, "Shirt", "Wool", true, 1));

                customers.add( new Customer("Alikhan", customer_id_counter +=1 ,20, "+77777777777"));
                customers.add(new Customer("Bek", customer_id_counter +=1 ,40, "+77027777777"));

                orders.add(new Order(customers.get(0), order_id_counter +=1));
                orders.add( new Order(customers.get(1), order_id_counter +=1));



        }
}
