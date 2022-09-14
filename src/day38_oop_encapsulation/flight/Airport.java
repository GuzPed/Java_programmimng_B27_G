package day38_oop_encapsulation.flight;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virginia");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getDeparture());
        System.out.println(ticket1.getArrival());


        FlightTicket ticket2 = new FlightTicket("flying", "NY", "Canada");
        System.out.println(ticket2.getType());
        System.out.println(ticket2.getDeparture());
        System.out.println(ticket2.getArrival());



    }

}
