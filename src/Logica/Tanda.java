/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;


public class Tanda {
    private int idTanda;
    private Date hora;
    
    public Tanda() {
        this.idTanda = 0;
        this.hora = null;
    }

    public Tanda(int tanda, Date hora) {
        this.idTanda = tanda;
        this.hora = hora;
    }


    public int getTanda() {
        return idTanda;
    }

    public void setTanda(int tanda) {
        this.idTanda = tanda;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
}
