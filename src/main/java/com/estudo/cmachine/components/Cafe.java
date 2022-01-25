package com.estudo.cmachine.components;

public class Cafe {

    private String nome;

    private double quantidade;


    public Cafe(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
