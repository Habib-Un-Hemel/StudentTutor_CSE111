package Assignment2.classwork.task1;

public class UniversityTester {
    public static void main(String[] args) {

        // Creating two University objects
        University uni1 = new University();
        University uni2 = new University();

        // Printing memory locations (references)
        System.out.println("uni1 location: " + uni1);
        System.out.println("uni2 location: " + uni2);

        // Printing instance variables before setting values
        System.out.println("\nBefore setting values:");
        System.out.println("uni1 name: " + uni1.name + ", country: " + uni1.country);
        System.out.println("uni2 name: " + uni2.name + ", country: " + uni2.country);

        // Changing instance variables of the first object
        uni1.name = "Imperial College London";
        uni1.country = "England";

        // Changing instance variables of the second object
        uni2.name = "BRAC University";
        uni2.country = "Bangladesh";

        // Printing instance variables after setting values
        System.out.println("\nAfter setting values:");
        System.out.println("uni1 name: " + uni1.name + ", country: " + uni1.country);
        System.out.println("uni2 name: " + uni2.name + ", country: " + uni2.country);

    }
}