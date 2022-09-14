package day19_loops_2;


public class InterviewTask {
    public static void main(String[] args) {
        String a = " nanan".trim();

        int length = a.length();
        String back = "";

        for (int last = length-1; last >=0; last-- ) {
            back += a.charAt(last);
        }

        if (a.equals(back)) {
            System.out.println("it is palidrome");
        } else {
            System.out.println("none");
        }

        System.out.println(a.equals(back)?"it is palidrome" :"none" );


    }

}
