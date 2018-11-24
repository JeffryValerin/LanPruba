/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Tanda;


public class DatosTanda {
    private int numRegistro;
   private Tanda vector3[];

   public int getNumRegistro() {
        return numRegistro;
    }

    private void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Tanda[] getVector3() {
        return vector3;
    }

    public DatosTanda(int tamañoVector) {
        this.numRegistro = 0;
        this.vector3 = new Tanda[tamañoVector];
    }

    
    public Tanda getRegistro(int pos){
        return this.vector3[pos];
    }
    public boolean insertarTanda(Tanda tandaObj) {
        if (this.numRegistro < this.vector3.length - 1) {
            this.vector3[numRegistro] = tandaObj;
            this.numRegistro++;
            return true;
        }
        return false;
    }
   public boolean yaExiste(int tanda) {
        if (this.numRegistro != 0) {
            for (int i=0; i<this.numRegistro; i++) {
                if (vector3[i].getTanda() == tanda) {
                    return true;
                }
            }
        }

        return false;
    }
   
   
   
   
}
