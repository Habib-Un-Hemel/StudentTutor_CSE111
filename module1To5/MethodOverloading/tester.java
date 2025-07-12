package module1To5.MethodOverloading;

public class tester {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.bark(3);
        d.bark("Woof");
    }
}
