public class Triangulo extends Triangle {

    public Triangulo(){
        super();
    }


    //figura del diamante
    public void dibujarDiamante(int tamaño){

        Triangle diamantesIquierdo = new Triangle();
        diamantesIquierdo.changeSize(tamaño, tamaño);
        diamantesIquierdo.changeColor("red");
        diamantesIquierdo.moveLeft();
        diamantesIquierdo.makeVisible();

        Triangle diamantesDerecho = new Triangle();
        diamantesDerecho.changeSize(tamaño, tamaño);
        diamantesDerecho.changeColor("red");
        diamantesDerecho.moveRight();
        diamantesDerecho.makeVisible();

        Triangle diamanteSuperior = new Triangle();
        diamanteSuperior.changeSize(tamaño, tamaño);
        diamanteSuperior.changeColor("red");
        diamanteSuperior.moveUp();
        diamanteSuperior.moveUp();
        diamanteSuperior.makeVisible();


    }
    //figura de la pica
    public void dibujarPica(int tamaño){

        Triangle picaIquierdo = new Triangle();
        picaIquierdo.changeSize(tamaño, tamaño);
        picaIquierdo.changeColor("black");
        picaIquierdo.moveLeft();
        picaIquierdo.makeVisible();

        Triangle picaDerecho = new Triangle();
        picaDerecho.changeSize(tamaño, tamaño);
        picaDerecho.changeColor("black");
        picaDerecho.moveRight();
        picaDerecho.makeVisible();

        Triangle picaSuperior = new Triangle();
        picaSuperior.changeSize(tamaño, tamaño);
        picaSuperior.changeColor("black");
        picaSuperior.moveUp();
        picaSuperior.moveUp();
        picaSuperior.makeVisible();


    }
    
    
    
}
