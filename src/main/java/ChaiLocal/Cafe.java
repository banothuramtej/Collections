package ChaiLocal;

import java.util.ArrayList;
import java.util.List;

public class  Cafe {
    public String name;
    public String area;

    public static void main(String[] args) {
        List<IcedTea> icedTeas = new ArrayList<>();
        List<BurgersSandwichesNonVeg> nonvegburger = new ArrayList<>();
        List<BurgersSandwichesVeg> vegburgers = new ArrayList<>();
        List<ColdCoffee> coldCoffees = new ArrayList<>();
        List<Fries> FRIES = new ArrayList<>();
        List<Sizzlers> sizzle = new ArrayList<>();
        List<ThickShakes> shakes = new ArrayList<>();
        List<TeaCoffee> tea = new ArrayList<>();
        List<MockTails> mockTails1=new ArrayList<>();

        TeaCoffee teaCoffee = new TeaCoffee();
        teaCoffee.gingerChai="20";
        teaCoffee.lemonTea="20";
        teaCoffee.greenTea="20";
        teaCoffee.kashmiriChai="25";
        teaCoffee.coffie="25";
        tea.add(teaCoffee);

        ThickShakes thickShakes =new ThickShakes();
        thickShakes.butterScotch="99";
        thickShakes.strawberry="99";
        thickShakes.blueBerry="99";
        thickShakes.pineApple="99";
        thickShakes.belgianDarkChocolate="99";
        thickShakes.kitkatOreo="99";
        thickShakes.nuttelaBrownie="119";
        thickShakes.loadedDryfruit="119";
        shakes.add(thickShakes);

        Sizzlers sizzlers=new Sizzlers();
        sizzlers.hotSizzlingBrowine="119";
        sizzlers.chocolateOVERload="119";
        sizzlers.topNotchSizzler="149";
        sizzle.add(sizzlers);

        Fries fries=new Fries();
        fries.chikenlollyPop="179";
        fries.chickenStrips="149";
        fries.frenchFriesSalted="44";
        fries.FrenchFriesPeriperi="59";
        fries.chickenStrips="149";
        FRIES.add(fries);

        BurgersSandwichesVeg burgersSandwichesVeg=new BurgersSandwichesVeg();
        burgersSandwichesVeg.classicVegSandwich="79";
        burgersSandwichesVeg.spicyTomatoSandwich="79";
        burgersSandwichesVeg.classicVegBurger="89";
        burgersSandwichesVeg.aalloTikkiBurger="89";
        burgersSandwichesVeg.chilliCheeseBurger="99";
        vegburgers.add(burgersSandwichesVeg);

        BurgersSandwichesNonVeg burgersSandwichesNonVeg=new BurgersSandwichesNonVeg();
        burgersSandwichesNonVeg.classicChikenBurger="99";
        burgersSandwichesNonVeg.eggSteakBurger="99";
        burgersSandwichesNonVeg.eggChikenBurger="119";
        burgersSandwichesNonVeg.tandooriChickenSandwich="99";
        burgersSandwichesNonVeg.classicChikenSandWich="99";
        nonvegburger.add(burgersSandwichesNonVeg);

        MockTails mockTails=new MockTails();
        mockTails.blueMoon="99";
        mockTails.mintsMagic="99";
        mockTails.realRedRasberry="99";
        mockTails.sillyStrawberry="99";
        mockTails.peachApricot="99";
        mockTails.virginMogito="99";
        mockTails1.add(mockTails);

        IcedTea icedTea=new IcedTea();
        icedTea.lemonIcedTea="69";
        icedTea.peachIcedTea="69";
        icedTea.respberryIcedTea="69";
        icedTeas.add(icedTea);

        ColdCoffee coldCoffee=new ColdCoffee();
        coldCoffee.classicCOffee="99";
        coldCoffee.irishCoffee="99";
        coldCoffee.caramelCoffee="99";
        coldCoffee.nutellaCoffee="119";
        coldCoffee.almondCoffee="119";
        coldCoffee.chocolateCoffee="99";
        coldCoffees.add(coldCoffee);




    }



}
