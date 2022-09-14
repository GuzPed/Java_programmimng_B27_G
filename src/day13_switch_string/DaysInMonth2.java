package day13_switch_string;

public class DaysInMonth2 {
    public static void main(String[] args) {
        String month = "May";
        switch (month){
            case "JANUARY": case "MARCH":  case "MAY":  case "JULY":  case "AUGUSTE": case "OCTOBER": case "DECEMBER":
                System.out.println("31 days");
                break;
            case "FEBRUARY":
                System.out.println("28 days");
                break;
            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
                break;







        }








    }


}
