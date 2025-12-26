public class ClothingItem {
    private int ClothId;
    private double price;
    private String category;
    private String material;
    private boolean isAvailable;
    private int count_of_item;

    public ClothingItem(int clothId, double price, String category, String material, boolean isAvailable, int count_of_item) {
        setPrice(price);
        this.ClothId = clothId;
        setCategory(category);
        this.material = material;
        this.isAvailable = isAvailable;
        setCount_of_item(count_of_item);
    }

    public  ClothingItem(){}

    public void Adding_item(Order order, ClothingItem item){
        if (item.isAvailable() && count_of_item > 0){
            order.getClothingItems().add(item);
            count_of_item -= 1;
        }else{
            if (!item.isAvailable() && count_of_item > 0){
                System.out.println(Availability());
            }else{
                System.out.println(OutOfStock());
            }
        }
    }

    public String Availability(){
        return  getCategory() + " is not available now! So, it has deleted from order...";
    }

    public String OutOfStock(){
        return getCategory() + " out of stock! So, it has deleted from order...";
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }else{
            System.out.println("Price value is not correct");
            this.price = 0;
        }

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category != null && !category.isEmpty()){
            this.category = category;}
        else{
            System.out.println("Category can't be empty");
            this.category = "No info";
        }
        this.category = category;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getCount_of_item() {
        return count_of_item;
    }

    public void setCount_of_item(int count_of_item) {
        if (count_of_item > 0){
            this.count_of_item = count_of_item;
        }else{
            System.out.println("Count of item less than 1");
            this.count_of_item = 0;
        }

    }

    public int getClothId() {
        return ClothId;
    }

    public void setClothId(int clothId) {
        ClothId = clothId;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "price=" + price +
                ", category='" + category + '\'' +
                ", material='" + material + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
