package TAREA3.BRIDGE.Yout;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Color: Red \n Radius:"+radius+"\nx: "+x+"\ny: "+y);
    }
}
