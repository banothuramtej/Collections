package Bank;

public class Atm {

    public int atmid;
    public int balance;
    public String location;

    @Override
    public String toString() {
        return "Atm{" +
                "atmid=" + atmid +
                ", balance=" + balance +
                ", location='" + location + '\'' +
                '}';
    }
}
