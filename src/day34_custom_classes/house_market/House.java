package day34_custom_classes.house_market;

public class House {

    String type;
    double squareFeet;
    int numberOfBedrooms;
    int numberOfBaths;
    boolean inCity;
    boolean hasGarage;

    public double calculateMortgage(){
        if (numberOfBedrooms < 2) {
            return 1500;
        } else if (numberOfBedrooms < 4){
            return 2000;
        } else {
            return 2500;
        }}

    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBaths=" + numberOfBaths +
                (inCity? ", In the City: " : ", In the suburbs" ) + (hasGarage? ", has garage " : ", no garage. Street parking");
    }
}
/*
 public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBaths=" + numberOfBaths +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';
 */