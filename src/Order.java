import java.time.Instant;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private int Order_id;
    private ArrayList<ClothingItem> ClothingItems;
    private Instant orderDate;

    public Order(Customer customer, int Order_id){
        this.customer = customer;
        this.Order_id = Order_id;
        this.ClothingItems = new ArrayList<>();
        this.orderDate = Instant.now();
    }

    public double getTotalPrice(){
        double totalPrice = 0.0;
        for (ClothingItem clothingItem : ClothingItems){
            totalPrice +=  clothingItem.getPrice();
        }
        return  totalPrice;
    }

    public double getTotalPriceWithDiscount(){
        double totalPrice = getTotalPrice();
        return totalPrice - (totalPrice * (customer.getDiscount_type() / 100));

    }

    public static int counter(int c){
        return c += 1;
    }

    public int getOrder_id(){
        return Order_id;
    }

    public void setOrder_id(){
        this.Order_id = Order_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<ClothingItem> getClothingItems() {
        return ClothingItems;
    }

    public void setClothingItems(ArrayList<ClothingItem> clothingItems) {
        this.ClothingItems = clothingItems;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", Order_id=" + Order_id +
                ", ClothingItems=" + ClothingItems +
                ", orderDate=" + orderDate +
                '}';
    }
}
