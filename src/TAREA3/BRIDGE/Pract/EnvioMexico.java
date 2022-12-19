package TAREA3.BRIDGE.Pract;

public class EnvioMexico implements InterfaceEnvio{
    @Override
    public void procesarPedido() {
        System.out.println("Pedido procesado a M");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregado a M");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido enviado a M");
    }
}
