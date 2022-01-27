package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.*;
import com.estudo.cmachine.maquinas.MaquinaDeCafeBasica;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public class MaquinaDeCafeBasicaBuilder implements Builder{

    private TipoDeMaquina tipoDeMaquina;
    private Configuracao configuracao;
    private TipoDeCafe tipoDeCafe;
    //private CafeMoido cafeMoido;
    private UnidadeDePreparacao unidadeDePreparacao;

    @Override
    public void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina) {
        this.tipoDeMaquina = TipoDeMaquina.BASICA;
    }

    @Override
    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = new Configuracao(30,480);
    }

    @Override
    public void setTipoDeCafe(TipoDeCafe tipoDeCafe) {
        this.tipoDeCafe = TipoDeCafe.FILTRADO;
    }

    //    @Override
//    public void setCafeMoido(CafeMoido cafeMoido) {
//        this.cafeMoido = cafeMoido;
//    }

    @Override
    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public MaquinaDeCafeBasica getResult(){
        return new MaquinaDeCafeBasica(tipoDeMaquina, configuracao, unidadeDePreparacao);
    }

    public BebidaDeCafe fazCafeFiltrado(){
        BebidaDeCafe bebidaDeCafe;
        return  bebidaDeCafe = new MaquinaDeCafeBasica(tipoDeMaquina, configuracao, unidadeDePreparacao).prepararCafeFiltrado(configuracao, tipoDeCafe);
    }


}
