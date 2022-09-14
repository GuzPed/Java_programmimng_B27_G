package day39_oop_inheritance.library;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";
        //book1 has access to 6 instance variables

        AudioBook book2 = new AudioBook();
        book2.duration = 45.20;
        book2.narrator = "James Bond";
        book2.hasMovie = true;
        //book2 has access to 8 variables. all of the variables from the parent book class and the 2 variables declared in the AudioBook class

        EBook book3 = new EBook();
        book3.size=24.12;
        book3.onKindle = true;
        //book3.narrator = the narratos was declared in the Audiobook class
        //book3 has access to 8 variables.All the variables from the parent book class and 2 variables from Ebook class






    }
}
