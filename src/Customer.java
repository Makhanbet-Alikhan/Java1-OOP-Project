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


    public static int counter(int c) {
        return c += 1;
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
