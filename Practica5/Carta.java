public class Carta {
    private int valor; 
    private Palo palo;

    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public Palo getTipo() {
        return palo;
    }

    
    @Override
    public String toString() {
        String valorString;
        switch (valor) {
            case 11: valorString = "J"; break;
            case 12: valorString = "Q"; break;
            case 13: valorString = "K"; break;
            case 14: valorString = "A"; break;
            default: valorString = String.valueOf(valor); break;
        }
        return valorString + " de " + palo;
    }
}


