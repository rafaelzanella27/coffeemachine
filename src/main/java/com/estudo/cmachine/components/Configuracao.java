package com.estudo.cmachine.components;

public class Configuracao {

    private double quantidadeCafe;
    private double quantidadeAgua;

    public Configuracao(double quantidadeCafe, double quantidadeAgua) {
        this.quantidadeCafe = quantidadeCafe;
        this.quantidadeAgua = quantidadeAgua;
    }

    public double getQuantidadeCafe() {
        return quantidadeCafe;
    }

    public double getQuantidadeAgua() {
        return quantidadeAgua;
    }

}
