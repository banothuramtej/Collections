package Streamedemo.FunctionDemoTest;

import SwiggyLatest.Restaurant;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BySupplierDemoTest {
    Supplier<List<Restaurant>> restaurentLtst = () -> {
        List<Restaurant> list = new ArrayList<>();
        Restaurant restaurant = new Restaurant();
        list.add(restaurant);
        Restaurant restaurant1 = new Restaurant();
        restaurant1.name = "varalaxmi";
        list.add(restaurant1);
        return list;

    }
;
//    Consumer<List<Restaurant>> restataurentConsumer = (abc)->{
//        abc.stream().forEach(test->
//        System.out.println("consumer"+);
//    });
//

    };





