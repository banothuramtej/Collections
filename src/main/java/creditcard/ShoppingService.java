package creditcard;




public class  ShoppingService {
    public Product selectProduct(ProductSpecification ProductSpecification) {
        Product Product = new Product();
        Product.size = ProductSpecification.size;
        Product.colour = ProductSpecification.calour;
        Product.type = ProductSpecification.type;
        Product.price = "1800";
        return Product;
    }
        public String purchase(Product product, CreditCard creditCard){

            return "";




    }
}
