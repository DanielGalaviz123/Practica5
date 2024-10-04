public class Cuadrado extends Square {

    public Cuadrado() {
        super(); 
        makeInvisible(); 
    }

    //int tamaño=5;
    // dibujar el trebol 
    public void dibujarTrebol(int tamaño) {
       
       
        // Dibujamos 
        Square cuadradoIzquierdo = new Square();
        cuadradoIzquierdo.changeSize(tamaño);
        cuadradoIzquierdo.changeColor("black");
        cuadradoIzquierdo.moveLeft(); // Mover a la izquierda
        cuadradoIzquierdo.moveRight();
        cuadradoIzquierdo.makeVisible();
    
        Square cuadradoDerecho = new Square();
        cuadradoDerecho.changeSize(tamaño);
        cuadradoDerecho.changeColor("black");
        cuadradoDerecho.moveRight(); // Mover a la derecha
        cuadradoDerecho.makeVisible();
    
        // Dibujamos un cuadrado en el medio, arriba
        Square cuadradoSuperior = new Square();
        cuadradoSuperior.changeSize(tamaño);
        cuadradoSuperior.changeColor("black");
        cuadradoSuperior.moveUp(); // Mover hacia arriba
        cuadradoSuperior.makeVisible();
    }
    /* 

    // Metodo para probar la clase Cuadrado
    public static void main(String[] args) {
        Cuadrado trebol = new Cuadrado();
        int tamaño = 60; 
        trebol.dibujarTrebol(tamaño); 
    }*/

    public void dibujarCorazon(int tamaño){
        Square cuadradoCorazonIzquierdo= new Square();
        cuadradoCorazonIzquierdo.changeSize(tamaño);
        cuadradoCorazonIzquierdo.changeColor("red");
        cuadradoCorazonIzquierdo.moveLeft();
        cuadradoCorazonIzquierdo.moveRight();
        cuadradoCorazonIzquierdo.makeVisible();

        Square cuadradoCorazonDerecho= new Square();
        cuadradoCorazonDerecho.changeSize(tamaño);
        cuadradoCorazonDerecho.changeColor("red");
        cuadradoCorazonDerecho.moveRight();
        cuadradoCorazonDerecho.makeVisible();

        Square cuadradoCorazonSupeior= new Square();
        cuadradoCorazonSupeior.changeSize(tamaño);
        cuadradoCorazonSupeior.changeColor("red");
        cuadradoCorazonSupeior.moveUp();
        cuadradoCorazonSupeior.makeVisible();

    }

    public void dibujarFondo(int tamaño){
        tamaño=190;
        Square cartaFondo = new Square();
        cartaFondo.changeSize(tamaño);
        cartaFondo.moveLeft();
        cartaFondo.moveLeft();
        cartaFondo.moveLeft();
        cartaFondo.moveLeft();
        cartaFondo.moveLeft();
        cartaFondo.moveLeft();
        cartaFondo.moveLeft();
        cartaFondo.moveUp();
        cartaFondo.changeColor("green");
        cartaFondo.makeVisible();
    }



}
