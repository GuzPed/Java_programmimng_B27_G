package day39_oop_inheritance.homework.app;

public class YouTube extends App{
/*
Create a class Youtube
    - Youtube class inherits App class
    - create constructor to call parent constructor and set up variables (name and version)
    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
 */

    public YouTube(String version) {
        super("Youtube", version);
    }
        public void watchVideo(){
            System.out.println("Watching java tutorials");
    }

    @Override
    public String toString() {
        return "YouTube{" +
                "appName='" + appName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
