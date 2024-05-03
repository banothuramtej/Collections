package country;
public class Test {
    public static void main(String[] args){
        Country country = new Country();
        State state = new State();
        state.name="telangana";
        state.language="telugu";
        state.country=country;
         country.name="india";
        country.state=state;
            System.out.println("newdelhi"+country.state);



    }
}