package Streamedemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TicketDemoTest {
    public void ticketStatus(List<Ticket>ticketList,Predicate<Ticket>predicate) {
        Iterator<Ticket> iterator = ticketList.iterator();
        for (; iterator.hasNext(); ) {
            Ticket ticket = iterator.next();
            System.out.println("ticket ststus" + ticket);

        }
    }


    public static void main(String[] args) {


        Predicate<Ticket>faieldPredicate=(ticket)->ticket.status.equals("faield");
        Predicate<Ticket>sucessfulPredicate=(ticket)->ticket.status.equals("Sucessful");
        Predicate<Ticket>lockedPredicate=(ticket)->ticket.status.equals("Locked");

        List<Ticket>ticketList=new ArrayList<>();
        Ticket ticket=new Ticket();
        ticket.pnrNamber="2345678";
        ticket.status="faield";

        Ticket ticket1=new Ticket();
        ticket1.pnrNamber="23456";
        ticket1.status="sucesusful";

        Ticket ticket2=new Ticket();
        ticket2.pnrNamber="23456";
        ticket2.status="locked";

        ticketList.add(ticket);
        ticketList.add(ticket1);
        ticketList.add(ticket2);






    }
}
