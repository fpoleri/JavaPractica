package ejercicioSeleccionArg;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1)
        List<Jugador> seleccionArg = new ArrayList();
        Set<Jugador> titulares = new HashSet();
        Set<Jugador> suplentes = new HashSet();

        //2)
        ingresarJugadores(seleccionArg);
        //3)

        titularesYsuplentes(seleccionArg, titulares, suplentes);

        //4)
        System.out.println("Titulares: " + titulares.size());
        jugadoresTitulares(titulares);
        System.out.println("-------------------------------");

        //5)
        jugadorExiste(titulares, "Gonzalo", "Higuain");
        System.out.println("-------------------------------");

        //6)
        eliminarJugador(titulares, "Sergio", "Romero", 'A', 3010, 1050);
        System.out.println("-------------------------------");

        System.out.println("Cantidad actual de Titulares: " + titulares.size());

    }

    private static void ingresarJugadores(List<Jugador> seleccionArg) {
        // D:defensor , A:arquero , M:mediocampo , V:volante
        seleccionArg.add(new Jugador("Emiliano", "Martinez", 'A', 3000, 1900));
        seleccionArg.add(new Jugador("Juan", " Musso", 'A', 2009, 1000));
        seleccionArg.add(new Jugador("Sergio", "Romero", 'A', 3010, 1050));
        seleccionArg.add(new Jugador("Cristian", "Romero", 'D', 755, 500));
        seleccionArg.add(new Jugador("Gaston", "Avila", 'D', 850, 516));
        seleccionArg.add(new Jugador("German", "Pezzella", 'D', 880, 500));
        seleccionArg.add(new Jugador("Nicolas", "Tagliafico", 'V', 220, 1009));
        seleccionArg.add(new Jugador("Gonzalo", "Montiel", 'V', 1980, 1200));
        seleccionArg.add(new Jugador("Nahuel", "Molina", 'V', 2286, 1600));
        seleccionArg.add(new Jugador("Rodrigo", "de Paul", 'V', 2389, 1245));
        seleccionArg.add(new Jugador("Lionel", "Messi", 'M', 5000, 2000));
        seleccionArg.add(new Jugador("Andel", "Di Maria", 'M', 4799, 2000));
        seleccionArg.add(new Jugador("Paulo", "DyBala", 'M', 4677, 1891));
        seleccionArg.add(new Jugador("Gonzalo", "Higuain", 'V', 4616, 1777));
        seleccionArg.add(new Jugador("Lautaro", "Martinez", 'M', 3480, 1500));
        seleccionArg.add(new Jugador("Lucas", "Alario", 'M', 678, 3408));
    }

    private static void titularesYsuplentes(List<Jugador> seleccionArg, Set<Jugador> titulares, Set<Jugador> suplentes) {
        
        for (Jugador aux : seleccionArg) {
            if (aux.getPosicion() != 'A') {
                if (aux.promedioGoles() > 1.5) {
                    titulares.add(aux);
                } else {
                    suplentes.add(aux);
                }
            } else if (aux.getPosicion() == 'A') {
                if (aux.promedioGoles() > 2.5) {
                    titulares.add(aux);
                } else {
                    suplentes.add(aux);
                }
            }
        }
    }

    private static void jugadoresTitulares(Set<Jugador> titulares) {
        for (Jugador aux : titulares) {
            System.out.println(aux.getApellido() + " " + aux.getNombre());
        }

    }

    private static void jugadorExiste(Set<Jugador> titulares, String nomJugador, String apeJugador) {

        for (Jugador aux : titulares) {
            if ((aux.getNombre() == nomJugador) && (aux.getApellido() == apeJugador)) {
                System.out.println("El Jugador " + aux.getApellido() + " " + aux.getNombre()
                        + " existe entre los titulares !");
            }
        }
    }

    private static void eliminarJugador(Set<Jugador> titulares, String nom, String ape, char pos, int goles, int partidos) {
        titulares.remove(new Jugador(nom,ape,pos,goles,partidos));
        System.out.println("El jugador " + nom + " " + ape + " fue eliminado del conjunto !");
    }

}
