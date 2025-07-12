package module1To5.InstanceMethod;

public class tester{
    public static void main(String[] args) {
        House h = new House();
        h.window = 4;
        h.door = 2;
        h.view();
        h.increaseWindow(2);
        h.view();

    }

    
}