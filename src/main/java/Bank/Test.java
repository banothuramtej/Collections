package Bank;

import java.util.concurrent.Callable;

public class  Test {
    public static void main(String[] args){
        Account account = new Account();
        account.usserName="Ram";
        account.accountNamber=1234;
        account.ifc="abc123";
        account.branch="kodad";
        account.balance=12323;
        account.passWord="ram2226";
        System.out.println(account.toString());

        Atm atm = new Atm();
        atm.atmid=12345;
        atm.balance=2345;
        atm.location="kodad";
        Card card = new Card ();
        card.cardNo=1234567;
        card.expiryDate=2018;
        card.account=account;
        card.cvv=456;
        System.out.println(atm.toString());
        Transaction transaction = new Transaction();
        transaction.card=card;
        transaction.atm=atm;
        transaction.Withdrawl=100.00;
        transaction.transactionId="rasd";
        System.out.println(transaction.toString());



            }
        }

