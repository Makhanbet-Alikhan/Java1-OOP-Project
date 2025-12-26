import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private String name;
    private int CustomerId;
    private double discount_type;
    private String phoneNumber;

    public Customer(String name, int CustomerId, double discount_type, String phoneNumber){
        setName(name);
        this.CustomerId = CustomerId;
        setDiscount_type(discount_type);
        setPhoneNumber(phoneNumber);

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

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;}
        else{
            System.out.println("Name can't be empty");
            this.name = "No info";
        }
    }

    public double getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(double discount_type) {
        if (discount_type >= 0){
            this.discount_type = discount_type;
        }
        else{
            System.out.println("Discount type is entered wrong");
            this.discount_type = 0;
        }

    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber != null && !phoneNumber.isEmpty()){
            this.phoneNumber = phoneNumber;}
        else{
            System.out.println("Phone number can't be empty");
            this.phoneNumber = "No info";
        }
    }

    @Override
    public String toString(){
        return "Customer{name:" + name + ", customer_id:" + CustomerId + ", phoneNumber:" + phoneNumber + ", discountType:" + discount_type + "}";
    }
}
