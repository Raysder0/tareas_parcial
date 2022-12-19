package TAREA3.ADTER.Yout;

public class Main {
    public static void main(String args[]){
        Guitarra gElectrica = new GuitarraElectrica();
        gElectrica.encenderGuitarra();
        gElectrica.apagarGuitarra();
        Guitarra gAcustica = new GuitarraElectroAcustico();
        gAcustica.encenderGuitarra();
        gAcustica.apagarGuitarra();
    }
}
