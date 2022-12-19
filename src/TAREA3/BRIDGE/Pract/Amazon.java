package TAREA3.BRIDGE.Pract;

public abstract class Amazon {
    private InterfaceEnvio interfaceEnvio;

    public Amazon(InterfaceEnvio interfaceEnvio) {
        this.interfaceEnvio = interfaceEnvio;
    }
    public void asignarEnvio(InterfaceEnvio interfaceEnvio){
        interfaceEnvio = interfaceEnvio;
    }
    public void entregarPaquete(){
        interfaceEnvio.entregar();
    }
    public void enviarPaquete(){
        interfaceEnvio.enviar();
    }
    public InterfaceEnvio obtenerEnvio(){
        return interfaceEnvio;
    }
    public void procesarPedido(){
        interfaceEnvio.procesarPedido();
    }

}
