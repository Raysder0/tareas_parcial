package TAREA3.ADTER.Pract;

public class BombillaAdapter extends Bombilla{

    Vela Lavela = new Vela();
    @Override
    public void apagar() {
        Lavela.soplarParaApagar();
    }

    @Override
    public void aumentarintensidad() {
        Lavela.echarCombustible();
    }

    @Override
    public void encender() {
        Lavela.prenderFuego();
    }
}
