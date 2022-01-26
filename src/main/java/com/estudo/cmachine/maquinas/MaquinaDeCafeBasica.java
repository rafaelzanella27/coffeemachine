package com.estudo.cmachine.maquinas;

import com.estudo.cmachine.components.*;

import java.util.HashMap;
import java.util.Map;

public class MaquinaDeCafeBasica {

    private TipoDeMaquina tipoDeMaquina;
    private Map<TipoDeCafe, Configuracao> mapDeConfiguracao;
    private CafeEmGrao cafeEmGrao;
    private UnidadeDePreparacao unidadeDePreparacao;

    public MaquinaDeCafeBasica(TipoDeMaquina tipoDeMaquina, Map<TipoDeCafe, Configuracao> mapDeConfiguracao, CafeEmGrao cafeEmGrao, UnidadeDePreparacao unidadeDePreparacao) {
        this.tipoDeMaquina = tipoDeMaquina;
        this.mapDeConfiguracao = mapDeConfiguracao;
        this.cafeEmGrao = cafeEmGrao;
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public MaquinaDeCafeBasica(CafeEmGrao cafeEmGrao){
        this.mapDeConfiguracao = new HashMap<>();
        mapDeConfiguracao.put(TipoDeCafe.FILTRADO, new Configuracao(30,480));

    }

    public BebidaDeCafe prepararCafeFiltrado(){
        Configuracao configuracao = mapDeConfiguracao.get(TipoDeCafe.FILTRADO);
        return this.unidadeDePreparacao.preparar(TipoDeCafe.FILTRADO, cafeEmGrao, configuracao.getQuantidadeAgua());
    }

    public TipoDeMaquina getTipoDeMaquina() {
        return tipoDeMaquina;
    }

    public void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina) {
        this.tipoDeMaquina = tipoDeMaquina;
    }

    public Map<TipoDeCafe, Configuracao> getMapDeConfiguracao() {
        return mapDeConfiguracao;
    }

    public void setMapDeConfiguracao(Map<TipoDeCafe, Configuracao> mapDeConfiguracao) {
        this.mapDeConfiguracao = mapDeConfiguracao;
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
