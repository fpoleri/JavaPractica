package Ejercicio4;

public class Habilitado extends Estado {
       
    @Override
    public String toString() {
        return "Habilitado (Verde)";
    }
    
    @Override
    public Estado cambiarEstado() {
        return new EnAviso();
    }
    
    
}
