package SwiggyLatest;

import java.util.ArrayList;
import java.util.List;

public class SwiggyServices {

    public Restaurant restaurentService(){
      List<Restaurant> restaurants;       Restaurant varalaxmi = new Restaurant();
        varalaxmi.name = "varalaxmi";
        varalaxmi.rating = "good";
        varalaxmi.phoneNamber = "7675858728";
        Adress chaylocal = new Adress();
        chaylocal.area = "kodada";
        chaylocal.houseNO = "1-65";
        chaylocal.location = "janakiNager";
        chaylocal.pincode = "508206";
        chaylocal.strearNO = "2nd";
        varalaxmi.address = chaylocal;

        Dish ram = new Dish();


        Restaurant muraliKrishna = new Restaurant();
        muraliKrishna.name = "muraliKrishna";
        muraliKrishna.rating = "good";
        muraliKrishna.phoneNamber = "34567845678";
        Adress muraliKrishnaadd = new Adress();
        muraliKrishnaadd.area = "kodad";
        muraliKrishnaadd.location = "balajiNager";
        muraliKrishnaadd.pincode = "508206";
        muraliKrishnaadd.houseNO = "1-65";
        muraliKrishnaadd.strearNO = "2nd";

        List<Dish> dishes = new ArrayList<>();
        dishes.add(ram);
         return restaurentService();
    }
}









