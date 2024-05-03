package Streamedemo.FunctionDemoTest;

import jdk.tools.jmod.Main;

import javax.print.DocFlavor;
import java.util.function.BiFunction;

public class FunctionDemo {
    BiFunction<String,String,String> cancatFunction=(firstName,lastName)-> {
        String fullName = firstName + lastName;
        System.out.println("Name" + fullName);
        return fullName;

    };
    BiFunction<String,String,Integer>countFunction=(name1,name2)->{
        int t1=name1.length();
        int t2=name2.length();
        int t3=t1+t2;
        System.out.println(t3);
        return t3;
    };

    public String concateName(String firstName, String lastName) {
        String fullName=firstName+lastName;
        System.out.println("name"+fullName);
        return  fullName;



    }

    public static void main(String[] args) {
        FunctionDemo functionDemo=new FunctionDemo();
        demoTest .concateName("Varalaxmi");
    }
}
