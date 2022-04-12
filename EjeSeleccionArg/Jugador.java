package seleccion;

import java.util.*;

public class Jugador {
    private String nombre;
    private String apellido;
    private char posicion;
    private int goles;
    private int partidos;

    public Jugador() {
    }

    public Jugador(String nombre,String apellido, char posicion, int goles, int partidos) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.posicion = posicion;
        this.goles = goles;
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getPosicion() {
        return posicion;
    }

    public void setPosicion(char posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", goles=" + goles + ", partidos=" + partidos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.posicion != other.posicion) {
            return false;
        }
        if (this.goles != other.goles) {
            return false;
        }
        if (this.partidos != other.partidos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    public double promedioGoles(){
        return (double)this.getGoles()/this.getPartidos();
    }
}
