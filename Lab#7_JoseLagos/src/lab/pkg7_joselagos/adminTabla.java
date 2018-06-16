/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_joselagos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tali_
 */
public class adminTabla extends Thread {

    Tabla t = new Tabla();
    ArrayList<Pieza> piezas;
    String p;

    public adminTabla(ArrayList<Pieza> piezas, String p) {
        this.piezas = piezas;
        this.p = p;
    }

    public Tabla getT() {
        return t;
    }

    public void setT(Tabla t) {
        this.t = t;
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public void run() {
        t.setVisible(true);
        for (int k = 0; k < piezas.size(); k++) {
            DefaultTableModel m = (DefaultTableModel) t.tablita.getModel();
            Object row[] = {p, piezas.get(k).getNombre(), piezas.get(k).getTiempo()};
            m.addRow(row);
            int b = piezas.get(k).getTiempo();
            int c = b * 1000;
            
            try {
                Thread.sleep(c);
            } catch (Exception e) {

            }
            t.tablita.setModel(m);
        }

    }
}
