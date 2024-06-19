package com.example.clases;

import java.time.LocalDate;
import java.util.Arrays;

public class Socio {

    private String nombre;
    private int codSocio;
    private String apelidos;
    private String email;
    private LocalDate dataNacemento;
    private Actividade[] actividadesInscrito = new Actividade[3];

    public Socio(String nombre, int codSocio, String apelidos, String email, LocalDate dataNacemento,
            Actividade[] actividadesInscrito) {
        this.nombre = nombre;
        this.codSocio = codSocio;
        this.apelidos = apelidos;
        this.email = email;
        this.dataNacemento = dataNacemento;
        this.actividadesInscrito = actividadesInscrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(LocalDate dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public Actividade[] getActividadesInscrito() {
        return actividadesInscrito;
    }

    public void setActividadesInscrito(Actividade[] actividadesInscrito) {
        this.actividadesInscrito = actividadesInscrito;
    }

    @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", codSocio=" + codSocio + ", apelidos=" + apelidos + ", email=" + email
                + ", dataNacemento=" + dataNacemento + ", actividadesInscrito=" + Arrays.toString(actividadesInscrito)
                + "]";
    }

    public String toStringParaFicheiro() {
        return "Socio [nombre=" + nombre + ", codSocio=" + codSocio + ", apelidos=" + apelidos + ", email=" + email
                + ", dataNacemento=" + dataNacemento + ", actividadesInscrito=" + Arrays.toString(actividadesInscrito)
                + "]";
    }

}
