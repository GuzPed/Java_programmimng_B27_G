package day37_custom_classes_static;



import java.util.Arrays;

import static java.lang.Integer.*;
import static java.lang.Math.*; // access all static members from this class without the class name
import static java.util.Arrays.*;


public class ImportExample {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(PI);
        //System.out.println(max(4,1)); // method: Math.max()
        System.out.println(abs(-6)); // Math.abd

        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
        parseInt(""); // Integer.parseInt()

        int[] a = {43,4,2};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a)); // the reason you coudn't use just toString, is because it does not know whivh one you mean, there is multiple from differente files




    }
}
