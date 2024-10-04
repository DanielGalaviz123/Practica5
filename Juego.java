import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Juego {
    public static void main(String[] args) {
        // Crear un nuevo mazo cada vez que se ejecute el programa
        Mazo mazo = new Mazo();

        // Imprimir el mazo inicial
        System.out.println("Mazo inicial:");
        mazo.imprimirBaraja();

        // Revolver el mazo
        mazo.revolver();
        System.out.println("Mazo despues de revolver:");
        mazo.imprimirBaraja(); 

        // Crear jugadores
        Jugador jugador1 = new Jugador("Daniel");
        Jugador jugador2 = new Jugador("Victor");

        // Asignar cartas a los jugadores
        jugador1.asignarCartas(mazo);
        jugador2.asignarCartas(mazo);

        // Mostrar la informacion de los jugadores
        System.out.println(jugador1.obtenerInfo());
        System.out.println(jugador2.obtenerInfo());

        // Deshacerse de una carta para el jugador 1
     List<Carta> cartasDelJugador1 = jugador1.getCartas();
     if (!cartasDelJugador1.isEmpty()) {
     Carta cartaParaEliminar = cartasDelJugador1.get(0);
     jugador1.deshacerseCarta(cartaParaEliminar);
     System.out.println("Informacion del jugador 1 despues de deshacerse de una carta:");
     System.out.println(jugador1.obtenerInfo());

    // Regresar la carta eliminada al mazo
    mazo.regresarCartas(new ArrayList<>(Collections.singletonList(cartaParaEliminar))); // Cambie a un ArrayList

    // Mostrar el estado del mazo despues de regresar cartas
    System.out.println("Estado del mazo despues de regresar cartas:");
    mazo.imprimirBaraja();
} else {
    System.out.println("El jugador 1 no tiene cartas para eliminar.");
}
    }
}
