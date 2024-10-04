public class Circulo extends Circle {

    public Circulo() {
        super(); 
    }

    // Constructor que acepta una nueva posicion
    public Circulo(Posicion nuevaPosicion) {
        super(); 
        
        moveHorizontal(nuevaPosicion.getX() - 230); // Ajusta
        moveVertical(nuevaPosicion.getY() - 90); // Ajusta 
    }
    
    
}



