package day34_custom_classes.school;

public class School {
    public static void main(String[] args) {
        Student studentOne = new Student();
        System.out.println(studentOne); //gives an error "day34_custom_classes.school.Student@1d251891" without

        studentOne.name = "Maria";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;

        System.out.println(studentOne); //gives an error "day34_custom_classes.school.Student@1d251891" without

        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);

        //call the instance method
        // Student.study() this works only with STATIC method
        studentOne.study();

        System.out.println("=============================");

        Student studentTwo = new Student();
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);
        /*in this case we created a new Object of the Student class, it means this object
         has a fresh copy of the instance variable, which means they will have their
         default values
        */





    }



}
