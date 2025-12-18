import java.sql.SQLOutput;

public class Main {
        public static void main(String[] args){
                int customer_id_counter = 0;
                int order_id_counter = 0;

                ClothingItem Item1 = new ClothingItem(300, "T-shirt", "Silk", true);
                ClothingItem Item2 = new ClothingItem(400, "Braces", "Silk", false);
                ClothingItem Item3 = new ClothingItem(500, "Shirt", "Wool", true);

                Customer customer1 = new Customer("Alikhan", customer_id_counter = Customer.counter(customer_id_counter) ,20, "+77777777777");
                Customer customer2 = new Customer("Bek", customer_id_counter = Customer.counter(customer_id_counter) ,40, "+70777777777");

                Order Alikhan_order = new Order(customer1, order_id_counter = Order.counter(order_id_counter));
                Alikhan_order.getClothingItems().add(Item1);
                Alikhan_order.getClothingItems().add(Item2);

                Order Bek_order = new Order(customer2, order_id_counter = Order.counter(order_id_counter));
                Bek_order.getClothingItems().add(Item1);
                Bek_order.getClothingItems().add(Item3);

                System.out.println(Alikhan_order);
                System.out.println(Alikhan_order.getTotalPrice());
                System.out.println(Alikhan_order.getTotalPriceWithDiscount());

                System.out.println(Bek_order);
                System.out.println(Bek_order.getTotalPrice());
                System.out.println(Bek_order.getTotalPriceWithDiscount());
        }
}
