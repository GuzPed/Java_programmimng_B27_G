package day16_string_methods_3;

public class DynamicIndexOf {
    public static void main(String[] args) {
        String str = "mississippi"; // goal is to find all the indexes of all 'i' characters
                  //  012345678910

        System.out.println("First i: " + str.indexOf('i'));
        System.out.println("Last i: " + str.lastIndexOf('i'));

        System.out.println("other use of indexOf");
        System.out.println("First i: " + str.indexOf('i'));
        System.out.println(("Second i " + str.indexOf('i',4)));
        System.out.println(("Third i " + str.indexOf('i',6)));

        System.out.println("-------------------------------------------");

        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI+1);
        int thirdI = str.indexOf('i', secondI+1);



    }
}
