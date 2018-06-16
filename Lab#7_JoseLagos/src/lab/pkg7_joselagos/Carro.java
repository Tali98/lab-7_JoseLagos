/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_joselagos;

import java.util.ArrayList;

/**
 *
 * @author tali_
 */
public class Carro {
    private String carro;
    private ArrayList<Pieza>listPiezas = new ArrayList();

    
    
    public Carro(String carro) {
        this.carro = carro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public ArrayList<Pieza> getListPiezas() {
        return listPiezas;
    }

    public void setListPiezas(ArrayList<Pieza> listPiezas) {
        this.listPiezas = listPiezas;
    }

    @Override
    public String toString() {
        return carro + listPiezas;
    }
    
    
}
