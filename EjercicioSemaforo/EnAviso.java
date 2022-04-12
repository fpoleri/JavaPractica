package Ejercicio4;

public class EnAviso extends Estado {

    @Override
    public String toString() {
        return "En aviso (Amarillo)";
    }

    @Override
    public Estado cambiarEstado() {
        return new NoHabilitado();
    }
    
}
