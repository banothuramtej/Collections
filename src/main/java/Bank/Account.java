package Bank;

public class Account {
    public String usserName;
    public int accountNamber;
    public String ifc;
    public String branch;
    public int balance;
    public String passWord;

    @Override
    public String toString() {
        return "Account{" +
                "usserName='" + usserName + '\'' +
                ", accountNamber=" + accountNamber +
                ", ifc='" + ifc + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
