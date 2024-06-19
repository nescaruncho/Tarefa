package com.example.clases;

public class Actividade {

    private int codActividade;
    private String nomeActividade;
    private int horasSemanais;
    private String salaActividade;

    public Actividade(int codActividade, String nomeActividade, int horasSemanais, String salaActividade) {
        this.codActividade = codActividade;
        this.nomeActividade = nomeActividade;
        this.horasSemanais = horasSemanais;
        this.salaActividade = salaActividade;
    }

    public int getCodActividade() {
        return codActividade;
    }

    public void setCodActividade(int codActividade) {
        this.codActividade = codActividade;
    }

    public String getNomeActividade() {
        return nomeActividade;
    }

    public void setNomeActividade(String nomeActividade) {
        this.nomeActividade = nomeActividade;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public String getSalaActividade() {
        return salaActividade;
    }

    public void setSalaActividade(String salaActividade) {
        this.salaActividade = salaActividade;
    }

    @Override
    public String toString() {
        return "Actividade [codActividade=" + codActividade + ", nomeActividade=" + nomeActividade + ", horasSemanais="
                + horasSemanais + ", salaActividade=" + salaActividade + "]";
    }

    public String toStringParaFicheiro() {
        return "Actividade [codActividade=" + codActividade + ", nomeActividade=" + nomeActividade + ", horasSemanais="
                + horasSemanais + ", salaActividade=" + salaActividade + "]";
    }
}
