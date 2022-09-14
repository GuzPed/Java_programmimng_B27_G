package day36_custom_classes_constructor.food;

public class Food {
    /*
    create a class called Food
        - data:
            name, quantity, unit price, total price
            */
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    /*
        - constructor
           - create a constructor that creates a Food object with the name
            - create a constructor that creates a Food object with the name and quantity
            - create a constructor that creates a Food object with the name, quantity, and unit price
            	-> call calculatePrice() method here
      */

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();

    }

    /*- method:
           	- calculatePrice(): multiple the quantity by unit price and assign the value to the total price
            - toString()
                print all the Food information
                */

    public boolean calculatePrice(){
        if (quantity<=0 || unitPrice <=0) {
        return false;
        }
        totalPrice = quantity * unitPrice;
        return true;
    }

    @Override
    public String toString() {
        String str = "name= " + name;
        if (quantity !=0) {
            str += ", quantity: " + quantity;
        }
        if (unitPrice!=0) {
            str+= ", unit price " + unitPrice;
        }
        if (totalPrice !=0) {
            str+= ", total price: $" + totalPrice;
        }

        return " < " + str + " > ";
    }

    /*
    Create a separate class to create and test the Food objects
    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 20 and print the name of the food
     */
}
