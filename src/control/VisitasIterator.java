
package control;

import model.Pelicula;

public class VisitasIterator implements Iterator{
    public Pelicula[] catalogo;

    public VisitasIterator(Pelicula[] catalogo) {
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
            if(mayor < catalogo[i].visitas){
                mayor = catalogo[i].visitas;
                siguiente = catalogo[i];
            }
        }
        return siguiente;
    }
}
