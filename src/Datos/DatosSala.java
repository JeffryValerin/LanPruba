/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Sala;

/**
 *
 * @author Estudiante
 */
public class DatosSala {
    private int numeroRegistro;
   private Sala vector2[];

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    private void setNumRegistro(int numRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Sala[] getVector() {
        return vector2;
    }

    public DatosSala(int tamañoVector2) {
        this.numeroRegistro = 0;
        this.vector2 = new Sala[tamañoVector2];
    }

    public boolean insertarSala(Sala SalaObj) {
        if (this.numeroRegistro < this.vector2.length - 1) {
            this.vector2[numeroRegistro] = SalaObj;
            this.numeroRegistro++;
            return true;
        }
        return false;
    }
    
    public Sala getRegistro(int posicion){
        return this.vector2[posicion];
    }
    
   public boolean yaExiste(int id) {
        if (this.numeroRegistro != 0) {
            for (int i=0; i<this.numeroRegistro; i++) {
                if (vector2[i].getIdSala() == id) {
                    return true;
                }
            }
        }

        return false;
    }
    
    
    
    
}
