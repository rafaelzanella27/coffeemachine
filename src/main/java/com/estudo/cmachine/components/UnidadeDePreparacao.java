package com.estudo.cmachine.components;

public class UnidadeDePreparacao {


    public BebidaDeCafe preparar(TipoDeCafe tipoDeCafe, CafeEmGrao cafeEmGrao, double quantidade){
        return new BebidaDeCafe(tipoDeCafe, quantidade);
    }
}
