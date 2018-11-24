/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Ventas;

/**
 *
 * @author Estudiante
 */
public class DatosVentas {
    private int numRegistro;
   private Ventas vector4[];

    public DatosVentas(int numRegistro, Ventas[] vector4) {
        this.numRegistro = numRegistro;
        this.vector4 = vector4;
    }
   
    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Ventas[] getVector4() {
        return vector4;
    }

    public void setVector4(Ventas[] vector4) {
        this.vector4 = vector4;
    }
    
    
    public boolean insertarVentas(Ventas tandaObj) {
        if (this.numRegistro < this.vector4.length - 1) {
            this.vector4[numRegistro] = tandaObj;
            this.numRegistro++;
            return true;
        }
        return false;
    }
    
    /*public boolean yaExiste(int ventas) {
        if (this.numRegistro != 0) {
            for (int i=0; i<this.numRegistro; i++) {
                if (vector4[i].getNumeroVenta()== ventas) {
                    return true;
                }
            }
        }

        return false;
    }*/
}
