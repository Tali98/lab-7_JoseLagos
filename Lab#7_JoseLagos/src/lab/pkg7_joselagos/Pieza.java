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
public class Pieza {
    private String nombre;
    private Pieza padre;
    private String material;
    private int tiempo;
    private ArrayList<Pieza>listPiezasinternas = new ArrayList();

    public Pieza(String nombre, String material, int tiempo,Pieza padre) {
        this.nombre = nombre;
        this.material = material;
        this.tiempo = tiempo;
        this.padre= padre;
    }

    public Pieza() {
    }
    

    public Pieza getPadre() {
        return padre;
    }

    public void setPadre(Pieza padre) {
        this.padre = padre;
    }

    
    public ArrayList<Pieza> getListPiezasinternas() {
        return listPiezasinternas;
    }

    public void setListPiezasinternas(ArrayList<Pieza> listPiezasinternas) {
        this.listPiezasinternas = listPiezasinternas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
