package day39_oop_inheritance.homework.app;

public class App {
    /*
    Create an App class
    - create variables:
        name (app name), version
    - create constructor to initialize the variables
    - create method:
        download()
            Example output: prints $name is downloading version $version
     */

    String appName;
    String version;

    public App(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public void download(){
        System.out.println(appName + " is downloading version " + version);
    }
}
