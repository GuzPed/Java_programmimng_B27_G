package day35_custom_classes.carpet;

public class Carpet {
    double width;  // for instances - better to have the separated. not double width, length....
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian) {
    width = inputWidth;
    length = inputLength;
    unitPrice = inputUnitPrice;
    isPersian = inputIsPersian;
    calculatePrice();
}


    public void calculatePrice() {
        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice*=1.5;
        }
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice + ( isPersian? " Persian " : " Regular " )
                + " carpet " +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
