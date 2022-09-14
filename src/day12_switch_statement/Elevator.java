package day12_switch_statement;

public class Elevator {
    /*
    add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
     */
    public static void main(String[] args) {
        int floor = 2;
        String result = "";

        switch (floor) {
            case 1:
                result = "Lobby, StarBucks, Amazon Pick Up";
                break;
            case 2:
                result = "NASA, Cydeo, Discover";
                break;
            case 3:
                result = "Uber, Lyft, Chase";
                break;
            case 4:
                result = "Rooftop, Lounge ";
                break;
            default:
                result = "Invalid Floor Selected";
                break;


        }
        System.out.println(result);




    }
}
