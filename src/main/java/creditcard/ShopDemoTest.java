package creditcard;

import java.util.ArrayList;
import java.util.List;

public class ShopDemoTest {
    public static void main(String[] args){
        Product shirtProduct=new Product();
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.size="42";
        productSpecification.calour="white";
        productSpecification.price="3222";
        shirtProduct.type="Shirt";
        shirtProduct.productSpecification=productSpecification;

        Product tShirtProduct=new Product();
        ProductSpecification tSHIRTProductSpecification=new ProductSpecification();
        tSHIRTProductSpecification.size="32";
        tSHIRTProductSpecification.calour="block";
        tSHIRTProductSpecification.price="123";
        tShirtProduct.type="tshirt";
        tShirtProduct.productSpecification=productSpecification;

        Product jeansProduct=new Product();
        ProductSpecification jeansProductSpecification=new ProductSpecification();
        jeansProduct.size="28";
        jeansProduct.colour="blue";
        jeansProduct.price="456";
        jeansProduct.type="jeans";
        jeansProduct.productSpecification=productSpecification;

        Shop shop=new Shop();
        List<Product> productList=new ArrayList<>();
        productList.add(jeansProduct);
        productList.add(shirtProduct);
        productList.add(tShirtProduct);

        shop.productList=productList;
        System.out.println(shop);

 



    }
}
