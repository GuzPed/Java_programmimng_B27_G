package day40_oop_inheritance.app;

public class Youtube extends App{

    public Youtube( double version){
        super("Youtube",version);
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }

}
