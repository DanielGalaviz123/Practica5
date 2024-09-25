import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> cartas;

    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cartas = new ArrayList<>();
    }

    // Asignar cartas del mazo
    public void asignarCartas(Mazo mazo) {
        List<Carta> cartasAsignadas = mazo.repartirMano(); // Reparte 7 cartas
        cartas.addAll(cartasAsignadas); // Añade las cartas al jugador
    }

    // Deshacerse de una carta
    public void deshacerseCarta(Carta carta) {
        cartas.remove(carta);
    }

    // Obtener informacion del jugador
    public String obtenerInfo() {
        StringBuilder info = new StringBuilder("Jugador: " + nombre + "\nCartas: ");
        for (Carta carta : cartas) {
            info.append(carta.toString()).append(", ");
        }
        return info.toString();
    }

    // Obtener las cartas del jugador
    public List<Carta> getCartas() {
        return cartas;
    }
}

