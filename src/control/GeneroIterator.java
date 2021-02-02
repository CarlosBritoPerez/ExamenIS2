
package control;

import model.Pelicula;


public class GeneroIterator implements Iterator{
    public Pelicula[] catalogo;
    public String genero;

    public GeneroIterator(Pelicula[] catalogo, String genero) {
        this.catalogo = catalogo;
        this.genero = genero;
    }
            
    @Override
    public boolean hasNext(){
        return false;
    }
    
    @Override
    public Object Next(){
                       
        for(int i = 0; i < catalogo.length; i++){
            if(genero == catalogo[i].genero){
                return catalogo[i];
            }
        }
        return null;
    }
}
