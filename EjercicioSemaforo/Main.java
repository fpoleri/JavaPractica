package Ejercicio4;

public class Main {

    public static void main(String[] args) {
        
        Estado habilitado = new Habilitado();
        Estado enAviso = new EnAviso();
        Estado noHabilitado = new NoHabilitado();
        
        Semaforo primerSemaforo = new Semaforo("Av. Don Bosco","Av. Gobernador Maya",habilitado);
        Semaforo segundoSemaforo = new Semaforo("Av Ramirez","La Paz",noHabilitado);
        Semaforo tercerSemaforo = new Semaforo("Av. America","Ejercito",enAviso);
        
        System.out.println(primerSemaforo.toString());
        
        primerSemaforo.cambiarEstado();
        
        System.out.println(primerSemaforo.toString());
                
        System.out.println("-------------------------------------------------");
        
        System.out.println(segundoSemaforo.toString());
        
        segundoSemaforo.cambiarEstado();
        
        System.out.println(segundoSemaforo.toString());
        
        System.out.println("-------------------------------------------------");
        
        System.out.println(tercerSemaforo.toString());
        
        tercerSemaforo.cambiarEstado();
        
        System.out.println(tercerSemaforo.toString());
        
        
    }
    
}
