
package control;

import model.Pelicula;


public class NovedadesIterator implements Iterator{
    
    public Pelicula[] catalogo;

    public NovedadesIterator(Pelicula[] catalogo) {
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
            if(mayor < catalogo[i].año){
                mayor = catalogo[i].año;
                siguiente = catalogo[i];
            }
        }
        return siguiente;
    }
}
