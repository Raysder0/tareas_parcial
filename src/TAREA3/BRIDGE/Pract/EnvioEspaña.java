package TAREA3.BRIDGE.Pract;

public class EnvioEspaña implements InterfaceEnvio{
    @Override
    public void procesarPedido() {
        System.out.println("Pedido procesado a E");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregado a E");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido enviado a E");
    }
}
