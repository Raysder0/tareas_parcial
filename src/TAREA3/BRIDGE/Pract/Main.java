package TAREA3.BRIDGE.Pract;

public class Main {
    public static void main(String args[]){
        RepartoAmazon repartoPortugal = new RepartoAmazon(new EnvioPortugal(), "1");
        RepartoAmazon repartoEspaña = new RepartoAmazon(new EnvioEspaña(), "2");
        RepartoAmazon repartoMexico = new RepartoAmazon(new EnvioMexico(), "3");

        System.out.println("pruebagit");

        repartoEspaña.procesarPedido();
        repartoEspaña.asignarEnvio(new EnvioMexico());
        repartoEspaña.procesarPedido();
    }
}
