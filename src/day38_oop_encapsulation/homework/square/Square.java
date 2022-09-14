package day38_oop_encapsulation.homework.square;

public class Square {
    /*
create a class called Square
        - data:
            side
        - constructor
            - create a constructor that creates a Square object with the side
            	call setter here
        - encapsulate the Square class
        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable
        - other methods methods:
            - calculateArea()
  				calculate and return the area of a Square
            - calculatePerimeter()
  				calculate and return the perimeter of a Square
            - toString()
                print the side, area, and perimeter of the Square object
    Create a separate class to create and test the Square objects
     */

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side >0){
            this.side = side;
        }

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + "area " + calculateArea()+
                '}';
    }

    public double calculateArea(){
        return side*4;
    }

}
