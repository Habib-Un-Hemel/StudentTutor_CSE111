package module1To5.MethodOverloading;

public class dog {
    public String name;

    public void bark() {
        System.out.println("Woof!");
    }
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof!");
        }
    }
    public void bark(String sound) {
        System.out.println(sound);
    }
    public void bark(String sound, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(sound);
        }
    }
    public void bark(int times, String sound) {
        for (int i = 0; i < times; i++) {
            System.out.println(sound);
        }
    }
    
}
