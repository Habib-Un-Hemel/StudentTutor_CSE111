package module1To5.InstanceMethod;

public class House {
    public int window;
    public int door;


public void increaseWindow(int x){
    window = window + x;
}
public void view(){
    System.out.println(window+" windows");
    System.out.println(door+" doors");
}


}
