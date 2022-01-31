package com.estudo.cmachine.maquinas;

import com.estudo.cmachine.components.*;


public class MaquinaDeCafePremium {

    private TipoDeMaquina tipoDeMaquina;
    private Configuracao configuracao;
    private UnidadeDePreparacao unidadeDePreparacao;

    public MaquinaDeCafePremium(TipoDeMaquina tipoDeMaquina, Configuracao configuracao, UnidadeDePreparacao unidadeDePreparacao) {
        this.tipoDeMaquina = tipoDeMaquina;
        this.configuracao = configuracao;
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public BebidaDeCafe prepararCafeFiltrado(Configuracao configuracao, TipoDeCafe tipoDeCafe){
        CafeMoido cafeMoido = new CafeMoido("Mellita", 1);
        return this.unidadeDePreparacao.prepararBebidaComCafeEmGrao(tipoDeCafe, cafeMoido, configuracao.getQuantidadeAgua());
    }

    public BebidaDeCafe prepararCafeExpresso(Configuracao configuracao, TipoDeCafe tipoDeCafe){
        CafeMoido cafeMoido = new CafeMoido("Mellita", 1);
        return this.unidadeDePreparacao.prepararBebidaComCafeEmGrao(tipoDeCafe, cafeMoido, configuracao.getQuantidadeAgua());
    }

    public BebidaDeCafe prepararCafeCappuccino(Configuracao configuracao, TipoDeCafe tipoDeCafe){
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

    public UnidadeDePreparacao getUnidadeDePreparacao() {
        return unidadeDePreparacao;
    }

    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }
}
