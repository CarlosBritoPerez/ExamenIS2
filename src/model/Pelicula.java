
package model;

public class Pelicula {
    
    public String titulo, genero, director;
    public float calificacion;
    public int duracion, año, visitas;
    public String[] actores;

    public Pelicula(String titulo, String genero, String director, float calificacion, int duracion, String[] actores, int año, int visitas) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.calificacion = calificacion;
        this.duracion = duracion;
        this.actores = actores;
        this.año = año;
        this.visitas = visitas;
    }

    public String[] getActores() {
        return actores;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }    

    public float getCalificacion() {
        return calificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public int getVisitas() {
        return visitas;
    }
    
}
