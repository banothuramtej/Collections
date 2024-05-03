package creditcard;
import Bank.Card;

import java.util.UUID;

public class CardService {

   public CreditCard getcreditcard(Usser Usser) {
       CreditCard creditCard = new CreditCard();
       creditCard.holderName = "Ramtej";
       creditCard.cardNo = "12345";
       creditCard.cvv = "145";
       creditCard.bankName = "Sbi";
       creditCard.avlBal = "12345";
       creditCard.limit = "20000";

       return creditCard;

   }
}
