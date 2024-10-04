import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartasRestantes;

    
    public Mazo() {
        cartasRestantes = new ArrayList<>();
        Palo[] tipos = Palo.values();

        for (Palo palo : tipos) {
            for (int numero = 2; numero <= 14; numero++) {
                cartasRestantes.add(new Carta(numero, palo));
            }
        }
    }

    // revolver la baraja
    public void revolver() {
        Collections.shuffle(cartasRestantes);
    }

    // Mostrar la baraja
    public void imprimirBaraja() {
        for (Carta carta : cartasRestantes) {
            System.out.println(carta.toString());
        }
        System.out.println("Total de cartas en el mazo: " + cartasRestantes.size());
    }

    // repartir una mano de 7 cartas y removerlas de la baraja
    public ArrayList<Carta> repartirMano() {
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < 7 && !cartasRestantes.isEmpty(); i++) {
            mano.add(cartasRestantes.remove(0));
        }
        return mano;
    }

    // restablecer el mazo a su configuración inicial
    public void reestablecer() {
        cartasRestantes.clear();
        Palo[] tipos = Palo.values();
        for (Palo palo : tipos) {
            for (int numero = 2; numero <= 14; numero++) {
                cartasRestantes.add(new Carta(numero, palo));
            }
        }
    }

    // Agregar carta al mazo
    public void agregarCarta(Carta otraCarta) {
        cartasRestantes.add(otraCarta);
    }

    // Eliminar carta del mazo
    public void eliminarCarta(Carta otraCarta) {
        cartasRestantes.remove(otraCarta);
    }

    // regresar cartas al mazo
    public void regresarCartas(ArrayList<Carta> cartas) {
        cartasRestantes.addAll(cartas);
    }
}

