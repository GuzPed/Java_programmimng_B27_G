package day24_arrays_day3;

public class SchoolStore_3 {
    public static void main(String[] args) {
        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        //print the catalog
        System.out.println("Full Catalog\n ID \t| Name | Price");
        for (int i=0; i<items.length;i++) {
            System.out.println(itemId[i] + " | " + items[i] + " | $"  + prices[i]);
        }
        System.out.println();

        // finding if we have jackets in the store
        boolean inStock = false;
        for (String eachItem: items ) {
            if( eachItem.equalsIgnoreCase("jacket")) {
                inStock = true;
                break;
            }
        }
        System.out.println();
        System.out.println(inStock? "Jacket is in stock" : " We don't have jackets right now");

        // find the index of notebook
        int index = -1;
        for (int i=0; i< items.length; i++) {
            if (items[i].equalsIgnoreCase("notebook")) {
                index=i;
            }
        }
        System.out.println(index);

        System.out.println();

        //find the most expensive item
        double maxPrice = prices[0];
        int indexOfMax = 0;

        for (int i=0; i<prices.length;i++) {  // we can start from int=1, because the first price is already the default
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("Most expensive item : " + itemId[indexOfMax] + " | " + items[indexOfMax] + " | $"  + prices[indexOfMax]);







    }
}
