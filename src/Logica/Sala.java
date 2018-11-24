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
public class Sala {
    
    private int idSala;
    private int cantidadButacas;
    
    public Sala() {
        this.idSala = 0;
        this.cantidadButacas = 0;
    }

    public Sala(int idSala, int cantidadButacas) {
        this.idSala = idSala;
        this.cantidadButacas = cantidadButacas;
    }


    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getCantidadButacas() {
        return cantidadButacas;
    }

    public void setCantidadButacas(int cantidadButacas) {
        this.cantidadButacas = cantidadButacas;
    }
    
}
