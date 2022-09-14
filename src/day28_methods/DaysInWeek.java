package day28_methods;

public class DaysInWeek {

    public static void main(String[] args) {
        System.out.println(dayInWeek(4));

        switch (dayInWeek(1)) {
            case "Mon":
            case "Fri":
                System.out.println("have full day of Java");
                break;
                case "Tue":
            case "Thu":
            System.out.println("half day of java");
                break;
            case "Wen":
                System.out.println("office hours");
                break;
        }
    }

    public static String dayInWeek(int day) {

        String[] days = {"Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun"};
        return days[day-1];  // convert the number to index

    }





}
