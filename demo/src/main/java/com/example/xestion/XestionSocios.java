package com.example.xestion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.example.clases.Socio;

public class XestionSocios {

    private static ArrayList<Socio> socios = new ArrayList<Socio>();

    public String mostrarSocios() {
        if (socios.isEmpty()) {
            return "A lista de socios está baleira";
        }

        JOptionPane.showMessageDialog(null, socios.toString(), "Lista socios", 0);

        return null;

    }
}
