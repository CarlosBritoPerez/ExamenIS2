
package control;

import model.Pelicula;


public class Organizador {
    public int orden;
    public Pelicula[] catalogo;

    public Organizador(int orden, Pelicula[] catalogo) {
        this.orden = orden;
        this.catalogo = catalogo;
        organizar();
    }
    
    public void organizar(){
        Iterator iter = null;
        switch (orden) {
            case 1:
                iter = new CalificacionIterator(catalogo);              
                break;
            case 2:
                iter = new GeneroIterator(catalogo, "");
                break;
            case 3:
                iter = new NovedadesIterator(catalogo);
                break;
            case 4:
                iter = new VisitasIterator(catalogo);
                break;
            default:
                break;
        }
        
        for (Pelicula catalogo1 : catalogo) {
            System.out.println(iter.Next());
        }
    }
    
    public static void main(String[] args) {        

        System.out.println("Ordenado por calificación:");
        
        System.out.println("Ordenado por genero:");
        
        System.out.println("Ordenado por novedades:");
        
        System.out.println("Ordenado por visitas:");
    }
}
