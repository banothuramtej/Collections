package Swiggy;

import java.nio.charset.StandardCharsets;

public class Test {
    public  static void main(String[] args){
        Address address= new Address();
        address.area="kodad";
        address.hoseNo="7-143";
        address.streat="wert";
        address.pincode="508206";
        Product product = new Product();

        Product productNO =new Product();
        product.vender="ram";
        product.quantity="12";

        Orderitem orderitem = new Orderitem();
        orderitem.price=23456;
        orderitem.quantity=2;
        orderitem.product=product;

        Order order=new Order();
        order.getOrderid="345";
        order.price=2345;
         order.address=address;

        System.out.println(order.getOrderid);





    }
}
