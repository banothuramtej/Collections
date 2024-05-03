package Streamedemo;

import Swiggy.Address;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Ticket> ticketMap = new HashMap<>();
        List<Ticket> ticketList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Ticket ticketadd = new Ticket();
            ticketadd.rowNamber= "2345";
            ticketadd.seatnamber = "2345";
            ticketadd.pnrNamber = "DG345" + i;
            ticketadd.status = "yes";

            ticketMap.put(ticketadd.hashCode(), ticketadd);
        }
            Set<Map.Entry<Integer,Ticket>>entrySetTicket=ticketMap.entrySet();
            Iterator<Map.Entry<Integer,Ticket>>integer=entrySetTicket.iterator();
            for (; integer.hasNext();){
             Map.Entry<Integer,Ticket> entry=integer.next();
             System.out.println("key"+entry.getKey()+entry.getKey()+"volue"+entry.getKey());
             ticketMap.forEach((k,v)->{
            });
             Ticket findTicket=new Ticket();
             findTicket.seatnamber="23456";
             findTicket.status="yes";
             findTicket.rowNamber="23456";
             findTicket.pnrNamber="34567+i";
             System.out.println("find the ticket from list");
             long listStartTime=System.currentTimeMillis();
            Iterator<Ticket> ticketIterator=ticketList.iterator();
            for (;ticketIterator.hasNext();){
                Ticket tt= ticketIterator.next();
                if (tt.equals(findTicket)){
                    System.out.println("find the ticket"+tt.pnrNamber);
                    break;














                }
            }
       }
    }
}













