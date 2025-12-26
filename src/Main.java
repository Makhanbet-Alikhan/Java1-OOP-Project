import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args){
                int customer_id_counter = 0;
                int order_id_counter = 0;
                int cloth_id_counter = 0;

                ClothingItem Item1 = new ClothingItem(cloth_id_counter += 1, 300, "T-shirt", "Silk", true, 2);
                ClothingItem Item2 = new ClothingItem(cloth_id_counter += 1,400, "Braces", "Silk", false, 3);
                ClothingItem Item3 = new ClothingItem(cloth_id_counter += 1,500, "Shirt", "Wool", true, 1);

                Customer customer1 = new Customer("Alikhan", customer_id_counter +=1 ,20, "+77777777777");
                Customer customer2 = new Customer("Bek", customer_id_counter +=1 ,40, "+77027777777");

                Order Alikhan_order = new Order(customer1, order_id_counter +=1);
                Item1.Adding_item(Alikhan_order, Item1);
                Item1.Adding_item(Alikhan_order, Item1);
                Item2.Adding_item(Alikhan_order, Item2);

                Order Bek_order = new Order(customer2, order_id_counter +=1);
                Item1.Adding_item(Bek_order, Item1);
                Item3.Adding_item(Bek_order, Item3);


        }
}
