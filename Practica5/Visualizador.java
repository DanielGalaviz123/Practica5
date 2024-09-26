public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        Square square = new Square(p); 
        square.makeVisible();

        // numero maximo de circulos en largo
        final int MAX_CIRCLES_IN_LENGTH = 8;

        for (int i = 0; i < c.getValor(); i++) {
            // Calcular la posicion en el cuadrado
            int row = i / MAX_CIRCLES_IN_LENGTH; // Fila basada en la cantidad de circulos
            int column = i % MAX_CIRCLES_IN_LENGTH; // Columna dentro de la fila

            // Espaciado entre circulos
            int spacing = 20; 

            // Nueva posicion de los circulos
            Posicion nuevaPosicion = new Posicion(p.x + (column * spacing), p.y + (row * spacing));

            Circle circle = new Circle(nuevaPosicion); // Un solo circulo para representar la carta

            // Establecer el color del circulo basado en el tipo de carta
            if (c.getTipo() == Palo.DIAMANTES) {
                circle.changeColor("red");
            } else if (c.getTipo() == Palo.CORAZONES) {
                circle.changeColor("green");
            } else if (c.getTipo() == Palo.PICAS) { 
                circle.changeColor("blue"); 
            } else { 
                circle.changeColor("gray");
            }

            circle.makeVisible(); // Hacer visible el circulo
        }
    }
}
