package day39_oop_inheritance.pizza;

public class Pizza {
    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }


    public String getSize(){
        return size;
    }

    public void setSize(String size){
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }
    }

    public int getNumberOfToppings(){
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings){
        if (numberOfToppings>=0){
            this.numberOfToppings = numberOfToppings;
        }
    }

    public double calculatePrice(){
        double price = 0;
        if (size!=null){
        return (size.equalsIgnoreCase("small")? 4: (size.equalsIgnoreCase("medium")? 6: 8))+numberOfToppings*0.75;
    }
        return -1; // return -1 if the size was not assigned
    }

public String toString(){
        return "size: " + size + " , number of Toppings: " + numberOfToppings + ", total price " + calculatePrice();
}


}
