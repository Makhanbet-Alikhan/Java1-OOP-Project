public class ClothingItem {
    private int ClothId;
    private double price;
    private String category;
    private String material;
    private boolean isAvailable;

    public ClothingItem(int clothId, double price, String category, String material, boolean isAvailable) {
        this.price = price;
        this.ClothId = clothId;
        this.category = category;
        this.material = material;
        this.isAvailable = isAvailable;
    }

    public  ClothingItem(){}

    public void AvailabiityAlarm(Order order, ClothingItem item){
        if (!item.isAvailable()){
            System.out.println(item.getCategory() + " is not available now! So, it has deleted from order...");
        }else {
            order.getClothingItems().add(item);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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
