package day13_switch_string;

public class Elevator2 {
    public static void main(String[] args) {
        int floor = 2;
        String companies;

        switch (floor) {
            case 1:
                companies = "Lobby, Starbucks, Amazon Pick Up";
                break;
            case 2:
                companies = "NASA, Cydeo, Discover";
                break;
            case 3:
                companies = "Uber, Lyft, Chase";
                break;
            case 4:
                companies = "Rooftoop, Lounge";
                break;
            default:
                companies = "Invalid floor number";
                break;

                    }
        System.out.println("floor number " + floor + ": " +companies);



    }

}
