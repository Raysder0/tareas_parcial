package TAREA3.BRIDGE.Yout;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Color: Green \n Radius:"+radius+"\nx: "+x+"\ny: "+y);
    }
}
