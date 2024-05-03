package creditcard;


import java.util.List;

public class Shop {
    public Product shirtProduct;
    public List<Product> productList;

    @Override
    public String  toString() {
        return "Shop{" +
                "shirtProduct=" + shirtProduct +
                ", productList=" + productList +
                '}';
    }
}
