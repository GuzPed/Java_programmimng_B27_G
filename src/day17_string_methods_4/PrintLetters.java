package day17_string_methods_4;

public class PrintLetters {
    public static void main(String[] args) {
        char first ='A';
        while (first <= 'Z') {
            System.out.print(first++);
        }
        System.out.println("______________________________________");
        char backwards = 'z';
        while (backwards>='a') {
            System.out.print(backwards--);
        }




    }
}
