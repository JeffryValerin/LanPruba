/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Pelicula;

/**
 *
 * @author Estudiante
 */
public class DatosPelicula {
   private int numRegistro;
   private Pelicula vector[];

    public int getNumRegistro() {
        return numRegistro;
    }

    private void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Pelicula[] getVector() {
        return vector;
    }

    public DatosPelicula(int tamañoVector) {
        this.numRegistro = 0;
        this.vector = new Pelicula[tamañoVector];
    }

    public boolean insertarPelicular(Pelicula peliObj) {
        if (this.numRegistro < this.vector.length - 1) {
            this.vector[numRegistro] = peliObj;
            this.numRegistro++;
            return true;
        }
        return false;
    }
    
    public Pelicula getRegistro(int pos){
        return this.vector[pos];
    }
    
   public boolean yaExiste(int id) {
        if (this.numRegistro != 0) {
            for (int i=0; i<this.numRegistro; i++) {
                if (vector[i].getId() == id) {
                    return true;
                }
            }
        }

        return false;
    }
   public boolean  EliminarPeli(int pos, Pelicula peliObj){
       
       if(pos>=0 && pos < this.numRegistro){
           this.vector[numRegistro] = peliObj;
           this.numRegistro--;
           return true;
       }
       return false;
   }
   public boolean editPelicula (int pos, Pelicula peliObj){
       
       if(pos>=0 && pos < this.numRegistro){
            this.vector[numRegistro] = peliObj;
            return false;
       }
       return false;
   }
   
}
