package TAREA3.BRIDGE.Pract;

public class RepartoAmazon extends Amazon{
    private String numPedido;

    public RepartoAmazon(InterfaceEnvio interfaceEnvio, String numPedido) {
        super(interfaceEnvio);
        this.numPedido = numPedido;
    }
    public void idPedido(){

    }

}
