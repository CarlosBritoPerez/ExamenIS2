
package control;

import model.Pelicula;


public class CalificacionIterator implements Iterator{
    
    public Pelicula[] catalogo;

    public CalificacionIterator(Pelicula[] catalogo) {
        this.catalogo = catalogo;
    }
            
    @Override
    public boolean hasNext(){
        return false;
    }
    
    @Override
    public Object Next(){
        
        Pelicula siguiente = null;
        float mayor = 0;
        
        for(int i = 0; i < catalogo.length; i++){
            if(mayor < catalogo[i].calificacion){
                mayor = catalogo[i].calificacion;
                siguiente = catalogo[i];
            }
        }
        return siguiente;
    }
}
