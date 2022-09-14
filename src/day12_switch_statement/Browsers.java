package day12_switch_statement;

public class Browsers {
    public static void main(String[] args) {
        String browser = "chrome";


        switch (browser) {
            case "chrome":
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
                break;
            case "safari":
                System.out.println("special set uo or apple computers");
                System.out.println("opening in safari");
                break;

            default:
                System.out.println("opening in chrome by default");

        }





    }
}
