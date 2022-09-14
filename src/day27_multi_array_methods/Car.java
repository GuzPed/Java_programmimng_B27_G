package day27_multi_array_methods;

public class Car {
    /*
    Algorith for the using car
    unlock car
    open the door
    sit down & start
    check mirrors
    seatbelt
    adjust seat
    put to drive and go
     */

    public static void unlock(){
        System.out.println("Unlocking car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitAndStart(){
        System.out.println("Sitting down in seat");
        System.out.println("Then insert the key");
        System.out.println("Start thr car");
    }
    public static void checkMirrors(){
        System.out.println("Checking left mirror");
        System.out.println("Checking right mirror");
        System.out.println("Checking rear view mirror");
    }

    public static void putOnSeatBelt(){
        System.out.println("Putting on seatbelt");
    }

    public static void drive(){
        System.out.println("Putting into a drive");
        System.out.println("Pressing on the accelerator");
    }

    public static void late(){
        unlock();
        openDoor();
        sitAndStart();
        drive();
    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        putOnSeatBelt();
        drive();
        System.out.println();

        late();


    }

}
