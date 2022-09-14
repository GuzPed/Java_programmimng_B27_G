package day15_string_methods_2.repeat_homework;

public class website {
    public static void main(String[] args) {

        String website ="ww.mamamia.ru";

        if (website.startsWith("www.") && (website.endsWith(".com") ||website.endsWith(".edu") || website.endsWith(".gov")  || website.endsWith(".net") )) {
            System.out.println("valid website");
        } else {
            System.out.println("not valid website for usa");
            if (!website.startsWith("www.")) {
                System.out.println("should start with www.");
            }

            if ((!website.endsWith(".com") ||!website.endsWith(".edu") || !website.endsWith(".gov")  || !website.endsWith(".net"))){
                System.out.println("shoud end with .com, .edu, .gov, .net");
            }
        }



    }
}
