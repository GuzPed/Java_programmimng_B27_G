package day39_oop_inheritance.app;

public class Instagram extends App{
    /*
    Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
     */

    public Instagram(String appName, String version){
        super(appName, version);
    }

    public void postPicture(){
        System.out.println("Posting picture to Instagram");
    }

}
