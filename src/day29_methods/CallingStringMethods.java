package day29_methods;
import my_utils.StringUtil;

public interface CallingStringMethods {

    public static void main(String[] args) {
        System.out.println( StringUtil.reverse("hello world"));


        System.out.println(StringUtil.isPalindrome("racecar"));


        System.out.println(StringUtil.fixFormat("racecar"));

        System.out.println(StringUtil.camelCase("JAVA will ruLE tHe wORLd"));

    }




}
