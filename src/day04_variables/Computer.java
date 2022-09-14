package day04_variables;

public class Computer {
    public static void main(String[] args) {
/*
declare and assign these variables with the most appropriate datatypes:

        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth

        create a summary of the information and print it. Be creative
 */

        String brand = "Microsoft";
        String modelOfLaptop = "Surface";
        int ramMemory = 8;
        boolean hasMonitor = true;
        boolean hasWiFiCord = true;
        double price = 762.99;
        int numberOfUsbLots = 5;
        String whatTypeOfCore = "i5";
        float sizeOfMonitor = 12.4F;
        int memorySize = 8;

        System.out.println("In out shop we present a new model of laptop for sale - " + brand +  " " + modelOfLaptop);
        System.out.println("Does it have a monitor? " + hasMonitor + " which is " + sizeOfMonitor + "\" " );
        System.out.println("Additional featutes: Does it have a WiFi cord? " + hasWiFiCord + ", Number of USB Slots - " + numberOfUsbLots + " , The Type of Core - " + whatTypeOfCore + ", and memory is " + memorySize);
        System.out.println("The price is $" + price + " \nIf you have any questions, please, do not hesitate to ask!");
        System.out.println("Thank You");





    }
}
