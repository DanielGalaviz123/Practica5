public class Visualizador {
    
   
    public static void carta(Carta carta, Posicion posicion) {

        Cuadrado dibuja = new Cuadrado();
        dibuja.dibujarFondo(0);

        //if para dibujar la figura
        if (carta.getTipo() == Palo.TREBOLES) { // TREBOLES
            Cuadrado trebol = new Cuadrado();
            int tamaño = 35; // Tamaño del trébol
            trebol.moveHorizontal(posicion.getX());
            trebol.moveVertical(posicion.getY());
            trebol.dibujarTrebol(tamaño); 

            // Dibujar circulos
            int cantidadCirculos = carta.getValor(); // Obtener el valor de la carta

            int desplazamientoInicial = 20;

            for (int i = 0; i < cantidadCirculos; i++) {
                Circulo circulo = new Circulo();
                int circuloTamaño = 10; // Tamaño del circulo
                circulo.changeSize(circuloTamaño); //cambiar tamano

                // cambiar la posicion de los circulos
                int espacioEntreCirculos = 5; 
                circulo.moveHorizontal(posicion.getX()); //posicion horizontal
                circulo.moveVertical(posicion.getY() + desplazamientoInicial + (i * (circuloTamaño + espacioEntreCirculos))); // posicion vertical
                
                circulo.makeVisible(); 
            }



        } else if (carta.getTipo() == Palo.CORAZONES) { // CORAZONES
            Cuadrado corazon = new Cuadrado();
            int tamaño = 35;

            corazon.moveHorizontal(posicion.getX());
            corazon.moveVertical(posicion.getY());
            corazon.dibujarCorazon(tamaño);

            
            int cantidadCirculos = carta.getValor();
            int desplazamientoInicial = 20;

            //dibujado de circulos
            for (int i = 0; i < cantidadCirculos; i++) {
                Circulo circulo = new Circulo();
                int circuloTamaño = 10; // Tamaño del circulo
                circulo.changeSize(circuloTamaño); 

                
                int espacioEntreCirculos = 5; // Espacio entre
                circulo.moveHorizontal(posicion.getX()); 
                circulo.moveVertical(posicion.getY() + desplazamientoInicial + (i * (circuloTamaño + espacioEntreCirculos)));
                
                
                circulo.makeVisible(); 
            }




        } else if (carta.getTipo() == Palo.DIAMANTES) { // DIAMANTES
            int cantidadCirculos=carta.getValor();// se define cuanto sera el valor de cantidadCirculos
            //este valor viene de getValor carta
            int desplazamientoInicial=20;
            int desplazamientoHorizontal=80;

            Triangulo diamante = new Triangulo();
            diamante.moveHorizontal(posicion.getX());
            diamante.moveVertical(posicion.getY());
            diamante.dibujarDiamante(40);


            for(int i=0;i< cantidadCirculos; i++){
                Circulo circulo= new Circulo();
                int circuloTamaño = 10; 
                circulo.changeSize(circuloTamaño); 

                
                int espacioEntreCirculos = 5; 
                circulo.moveHorizontal(posicion.getX()+ desplazamientoHorizontal); 
                circulo.moveVertical(posicion.getY() + desplazamientoInicial + (i * (circuloTamaño + espacioEntreCirculos)));
               
                
                circulo.makeVisible(); 


            }

        } else if (carta.getTipo() == Palo.PICAS) { // PICAS
            int cantidadCirculos=carta.getValor();

            int desplazamientoInicial=20;
            int desplazamientoHorizontal=80;
            

            Triangulo pica = new Triangulo();
            pica.moveHorizontal(posicion.getX());
            pica.moveVertical(posicion.getY());
            pica.dibujarPica(40);

            for(int i=0; i<cantidadCirculos; i++){
                Circulo circulo = new Circulo();
                int circuloTamaño=10;
                circulo.changeSize(circuloTamaño);


                int espacioEntreCirculos=5;
                circulo.moveHorizontal(posicion.getX()+ desplazamientoHorizontal);
                circulo.moveVertical(posicion.getY() + desplazamientoInicial + (i * (circuloTamaño + espacioEntreCirculos)));

                circulo.makeVisible();


            }

        } else { // NO SE ENCONTRO FIGURA
            System.out.println("No se encuentra este metodo");
        }
    }
}





