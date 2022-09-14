package day37_custom_classes_static.car;

public class Car {

    String model;
    Driver driver;

    // when i call Car constructor , the code inside is calling the driver constructor
    public Car(String model, String name, long licenceNumber, char licenseType){
        this.model = model;
        driver =new Driver(name, licenceNumber, licenseType); // creating a Driver object
    }

    public Car(String model, Driver driver){
        this.model = model;
        this.driver = driver;
    }

}
