package TAREA3.ADTER.Yout;

public class GuitarraElectrica extends Guitarra{
    @Override
    public void encenderGuitarra() {
        System.out.println("Tocando!!!!");
    }

    @Override
    public void apagarGuitarra() {
        System.out.println("Silencio!!!");
    }
}
