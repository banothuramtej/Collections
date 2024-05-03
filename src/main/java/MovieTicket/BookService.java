package MovieTicket;

public class BookService {
    public TicketBookConfirm bookTicket(Ticket ticket) {
        int ticketcost = 200;
        double totalTicketPrice = ticket.quantity * ticketcost;
        TicketBookConfirm ticketBookConfirm = new TicketBookConfirm();
        ticketBookConfirm.movieName = "TILLu";
        ticketBookConfirm.scanCode = "AAA";
        ticketBookConfirm.row = ticket.row;
        ticketBookConfirm.seatNumber = ticket.Seat;
        System.out.println(ticketBookConfirm.row);
        System.out.println(ticketBookConfirm.seatNumber);


        return ticketBookConfirm;
    }







}
