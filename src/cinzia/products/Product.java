package cinzia.products;

public class Product {
    private String name;
    private float price;
    private int quantity;
    private String keywords;
    private String imageUrl;

    public Product(String name, float price, String keywords, String imageUrl) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
        this.keywords = keywords;
        this.imageUrl = imageUrl;
    }

    /**
     * Returns the information about the product in JSON format
     * @return information about the product in JSON format
     */

    public String toJSON() {
        return String.format("{\"name\": \"%s\", \"price\": %f}", name, price);
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
