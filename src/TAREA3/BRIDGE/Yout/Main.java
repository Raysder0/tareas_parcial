package TAREA3.BRIDGE.Yout;

public class Main {
    public static void main(String args[]){
        Shape redCircle = new Circle(new RedCircle(), 30, 50, 9);
        Shape greenCircle = new Circle(new GreenCircle(), 60, 20, 8);
        redCircle.draw();
        greenCircle.draw();
    }
}
