package MovieTicket;

public class TestClass {
    public  static void main(String[] args){
        Ticket ticket=new Ticket();
        BookService service = new BookService();
        ticket.price=2345;
        ticket.quantity=2;
        ticket.row="we";
        ticket.Seat=234;
        service.bookTicket(ticket);




    }

}
