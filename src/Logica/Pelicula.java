/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class Pelicula {
   private int id;
   private String titulo;
   private String genero;
   private int  duracion;
   private String idioma;
   private String clasificaion;
   private String tipo;
   private String imagen; 

    public Pelicula(int id, String titulo, String genero, int duracion, String idioma, String clasificaion, String tipo, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.idioma = idioma;
        this.clasificaion = clasificaion;
        this.tipo = tipo;
        this.imagen = imagen;
    }
    public Pelicula() {
        this.id = 0;
        this.titulo = "";
        this.genero = "";
        this.duracion = 0;
        this.idioma = "";
        this.clasificaion = "";
        this.tipo = "";
        this.imagen = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getClasificaion() {
        return clasificaion;
    }

    public void setClasificaion(String clasificaion) {
        this.clasificaion = clasificaion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
  
}
