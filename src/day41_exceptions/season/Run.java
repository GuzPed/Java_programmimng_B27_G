package day41_exceptions.season;

public class Run {
    public static void main(String[] args) {

        Winter winter = new Winter(60, -100);
        System.out.println(winter);
        winter.activity();

        Summer summer = new Summer(100, 60);
        System.out.println(summer);
        summer.activity();

    }
}
