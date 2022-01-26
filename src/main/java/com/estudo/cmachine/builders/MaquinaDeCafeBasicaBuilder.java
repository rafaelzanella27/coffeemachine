package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.CafeEmGrao;
import com.estudo.cmachine.components.Configuracao;
import com.estudo.cmachine.components.TipoDeCafe;
import com.estudo.cmachine.components.UnidadeDePreparacao;
import com.estudo.cmachine.maquinas.MaquinaDeCafeBasica;
import com.estudo.cmachine.maquinas.TipoDeMaquina;

import java.util.HashMap;
import java.util.Map;

public class MaquinaDeCafeBasicaBuilder implements Builder{

    private TipoDeMaquina tipoDeMaquina;
    private Map<TipoDeCafe, Configuracao> mapDeConfiguracao;
    private CafeEmGrao cafeEmGrao;
    private UnidadeDePreparacao unidadeDePreparacao;

    @Override
    public void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina) {
        this.tipoDeMaquina = TipoDeMaquina.BASICA;
    }

    @Override
    public void setConfiguracao(Map<TipoDeCafe, Configuracao> mapDeConfiguracao) {
        this.mapDeConfiguracao = new HashMap<>();
        mapDeConfiguracao.put(TipoDeCafe.FILTRADO, new Configuracao(30,480));
    }

    @Override
    public void setCafeEmGrao(CafeEmGrao cafeEmGrao) {
        this.cafeEmGrao = cafeEmGrao;
    }

    @Override
    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public MaquinaDeCafeBasica getResult(){
        return new MaquinaDeCafeBasica(tipoDeMaquina, mapDeConfiguracao, cafeEmGrao, unidadeDePreparacao);
    }
}
