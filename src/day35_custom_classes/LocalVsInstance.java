package day35_custom_classes;

public class LocalVsInstance {
    //a & b are instance variable
    int a = 5;
    int b = 10;


    public LocalVsInstance(int a, int z) { // a & z are local variables
        this.a = a; // local a is priority, means that you are reassigning the local variable to itself, but that means the instance a did not change
        b = z;

    }

    public void print() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance(20,50);
        System.out.println(obj.a);  // 5
        System.out.println(obj.b); //20
    }


}
