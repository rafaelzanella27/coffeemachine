package com.estudo.cmachine.components;

public class BebidaDeCafe {
    private TipoDeCafe tipoDeCafe;

    private double quantidade;

    public BebidaDeCafe(TipoDeCafe tipoDeCafe, double quantidade) {
        this.tipoDeCafe = tipoDeCafe;
        this.quantidade = quantidade;
    }

    public TipoDeCafe getTipoDeCafe() {
        return tipoDeCafe;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) throws CafeException {
        if (quantidade >= 0.0){
            this.quantidade = quantidade;
        } else {
            throw new CafeException("Quantidade deve ser >= 0.0.");
        }

    }

    @Override
    public String toString() {
        return "BebidaDeCafe{" +
                "tipoDeCafe=" + tipoDeCafe +
                ", quantidade=" + quantidade +
                '}';
    }
}
