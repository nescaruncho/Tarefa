package com.example.xestion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.example.clases.Actividade;

public class XestionActividades {

    private static ArrayList<Actividade> actividades = new ArrayList<Actividade>();
    
    public String mostrarActividades() {

        if (actividades.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Non hai actividades para mostrar", "Lista actividades", 0);;
        }

        JOptionPane.showMessageDialog(null, actividades.toString(), "Lista actividades", 0);

        return null;
    }

    public void engadirActividades(Actividade actividade) {
        actividades.add(actividade);
    }

    public void borrarActividades(Actividade actividade) {
        actividades.remove(actividade);
    }
}
