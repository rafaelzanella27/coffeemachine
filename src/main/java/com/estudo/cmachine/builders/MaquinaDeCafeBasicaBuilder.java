package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.*;
import com.estudo.cmachine.maquinas.MaquinaDeCafeBasica;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public class MaquinaDeCafeBasicaBuilder implements Builder{

    private TipoDeMaquina tipoDeMaquina;
    private Configuracao configuracao;
    private CafeMoido cafeMoido;
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
    public void setCafeMoido(CafeMoido cafeMoido) {
        this.cafeMoido = cafeMoido;
    }

    @Override
    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public MaquinaDeCafeBasica getResult(){
        return new MaquinaDeCafeBasica(tipoDeMaquina, configuracao, cafeMoido, unidadeDePreparacao);
    }

    public BebidaDeCafe fazCafeFiltrado(){
        BebidaDeCafe bebidaDeCafe;
        return  bebidaDeCafe = new MaquinaDeCafeBasica(tipoDeMaquina, configuracao, cafeMoido, unidadeDePreparacao).prepararCafeFiltrado(configuracao, cafeMoido);
    }


}
