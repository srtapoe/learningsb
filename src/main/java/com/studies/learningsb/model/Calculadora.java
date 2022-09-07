package com.studies.learningsb.model;

public class Calculadora {

    private int numeroUm;
    private int numeroDois;

    public Calculadora(int numeroUm, int numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public Calculadora(){}

    public int getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(int numeroUm) {
        this.numeroUm = numeroUm;
    }

    public int getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(int numeroDois) {
        this.numeroDois = numeroDois;
    }

    public int multiplicar(int numeroUm, int numeroDois){
        return numeroUm * numeroDois;
    }
}
