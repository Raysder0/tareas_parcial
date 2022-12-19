package TAREA3.ADTER.Yout;

public class GuitarraElectroAcustico extends Guitarra{

    GuitarraAcustica acustica = new GuitarraAcustica();
    @Override
    public void encenderGuitarra() {
        acustica.tocar();
    }

    @Override
    public void apagarGuitarra() {
        acustica.dejarDeTocar();
    }
}
