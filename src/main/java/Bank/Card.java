package Bank;

public class Card {
    public int cardNo;
    public int expiryDate;
    public Account account;
    public int cvv;

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                ", expiryDate=" + expiryDate +
                ", account=" + account +
                ", cvv=" + cvv +
                '}';
    }
}
