package TAREA3.ADTER.Pract;

public class Main {
    public static void main(String args[]) {
        Bombilla moderno = new BombillaModerna();
        moderno.encender();
        moderno.aumentarintensidad();
        moderno.apagar();
        Bombilla clasico = new BombillaClasica();
        clasico.encender();
        clasico.aumentarintensidad();
        clasico.apagar();
        Bombilla vela = new BombillaAdapter();
        vela.encender();
        vela.aumentarintensidad();
        vela.apagar();
    }
}
