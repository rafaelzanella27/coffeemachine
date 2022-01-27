package com.estudo.cmachine.maquinas;

import com.estudo.cmachine.components.*;


public class MaquinaDeCafeBasica {

    private TipoDeMaquina tipoDeMaquina;
    private Configuracao configuracao;
    //private CafeMoido cafeMoido;
    private UnidadeDePreparacao unidadeDePreparacao;

    public MaquinaDeCafeBasica(TipoDeMaquina tipoDeMaquina, Configuracao configuracao, UnidadeDePreparacao unidadeDePreparacao) {
        this.tipoDeMaquina = tipoDeMaquina;
        this.configuracao = configuracao;
        //this.cafeMoido = cafeMoido;
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public BebidaDeCafe prepararCafeFiltrado(Configuracao configuracao, TipoDeCafe tipoDeCafe){
        CafeMoido cafeMoido = new CafeMoido("Mellita", 1);
        return this.unidadeDePreparacao.prepararBebidaComCafeEmGrao(tipoDeCafe, cafeMoido, configuracao.getQuantidadeAgua());
    }

    public TipoDeMaquina getTipoDeMaquina() {
        return tipoDeMaquina;
    }

    public void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina) {
        this.tipoDeMaquina = tipoDeMaquina;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public void Configuracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

//    public CafeMoido getCafeMoido() {
//        return cafeMoido;
//    }
//
//    public void setCafeMoido(CafeMoido cafeMoido) {
//        this.cafeMoido = cafeMoido;
//    }

    public UnidadeDePreparacao getUnidadeDePreparacao() {
        return unidadeDePreparacao;
    }

    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }
}
