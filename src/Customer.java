import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private String name;
    private int CustomerId;
    private double discount_type;
    private String phoneNumber;

    public Customer(String name, int CustomerId, double discount_type, String phoneNumber){
        this.name = name;
        this.CustomerId = CustomerId;
        this.discount_type = discount_type;
        this.phoneNumber = phoneNumber;

    }

    public Customer(){}

    public void Change_info(){
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to change? (name or phone number): ");
        String info = in.nextLine();
        if(Objects.equals(info, "name")){
            System.out.print("Print new name: ");
            String name_change = in.nextLine();
            setName(name_change);
        }else{
            System.out.print("Print new phone number: ");
            String num_change = in.nextLine();
            setPhoneNumber(num_change);
        }
        in.close();
    }

    public boolean hasPhone() {
        return phoneNumber != null && !phoneNumber.isEmpty();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(double discount_type) {
        this.discount_type = discount_type;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Customer{name:" + name + ", customer_id:" + CustomerId + ", phoneNumber:" + phoneNumber + ", discountType:" + discount_type + "}";
    }
}
