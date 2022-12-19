package TAREA3.BRIDGE.Pract;

public class EnvioPortugal implements InterfaceEnvio{

    @Override
    public void procesarPedido() {
        System.out.println("Pedido procesado a P");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregado a P");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido enviado a P");
    }
}
