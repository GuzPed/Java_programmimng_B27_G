package day39_oop_inheritance.homework.app;

public class Instragram extends App {
    /*
    Create a class Instagram
    - Instagram class inherits App class
    - create constructor to call parent constructor and set up variables (name and version)
    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
     */

    public Instragram( String version) {
        super("Instagram", version);
    }

    public void postPicture(){
        System.out.println("Posting picture to " + appName);
    }

    @Override
    public String toString() {
        return "Instragram{" +
                "appName='" + appName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
