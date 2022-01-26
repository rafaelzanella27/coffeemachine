package com.estudo.cmachine.maquinas;

import com.estudo.cmachine.components.*;


public class MaquinaDeCafeBasica {

    private TipoDeMaquina tipoDeMaquina;
    private Configuracao configuracao;
    private CafeEmGrao cafeEmGrao;
    private UnidadeDePreparacao unidadeDePreparacao;

    public MaquinaDeCafeBasica(TipoDeMaquina tipoDeMaquina, Configuracao configuracao, CafeEmGrao cafeEmGrao, UnidadeDePreparacao unidadeDePreparacao) {
        this.tipoDeMaquina = tipoDeMaquina;
        this.configuracao = configuracao;
        this.cafeEmGrao = cafeEmGrao;
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public BebidaDeCafe prepararCafeFiltrado(Configuracao configuracao, CafeEmGrao cafeEmGrao){
        return this.unidadeDePreparacao.preparar(TipoDeCafe.FILTRADO, cafeEmGrao, configuracao.getQuantidadeAgua());
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

    public CafeEmGrao getCafeEmGrao() {
        return cafeEmGrao;
    }

    public void setCafeEmGrao(CafeEmGrao cafeEmGrao) {
        this.cafeEmGrao = cafeEmGrao;
    }

    public UnidadeDePreparacao getUnidadeDePreparacao() {
        return unidadeDePreparacao;
    }

    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }
}
