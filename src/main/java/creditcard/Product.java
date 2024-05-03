package creditcard;

public class Product {
    public String size;
    public String colour;
    public String type;
    public String price;
    public ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product{" +
                "size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
