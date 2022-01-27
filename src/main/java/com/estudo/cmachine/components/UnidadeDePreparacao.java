package com.estudo.cmachine.components;

public class UnidadeDePreparacao {


    public BebidaDeCafe prepararBebidaComCafeEmGrao(TipoDeCafe tipoDeCafe, CafeMoido cafeMoido, double quantidade){
        return new BebidaDeCafe(tipoDeCafe, quantidade);
    }

    public BebidaDeCafe prepararBebidaComCafeMoido(TipoDeCafe tipoDeCafe, CafeMoido cafeMoido, double quantidade){
        return new BebidaDeCafe(tipoDeCafe, quantidade);
    }
}
