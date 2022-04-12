package Ejercicio4;

import java.util.logging.Logger;

public class NoHabilitado extends Estado{

    @Override
    public String toString() {
        return "No habilitado (Rojo)";
    }

    @Override
    public Estado cambiarEstado() {
        return new Habilitado();
    }
    
}
