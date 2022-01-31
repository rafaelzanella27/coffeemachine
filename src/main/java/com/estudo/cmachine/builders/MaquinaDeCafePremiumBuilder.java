package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.BebidaDeCafe;
import com.estudo.cmachine.components.Configuracao;
import com.estudo.cmachine.components.TipoDeCafe;
import com.estudo.cmachine.components.UnidadeDePreparacao;
import com.estudo.cmachine.maquinas.MaquinaDeCafeBasica;
import com.estudo.cmachine.maquinas.MaquinaDeCafePremium;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public class MaquinaDeCafePremiumBuilder implements Builder{

    private TipoDeMaquina tipoDeMaquina;
    private Configuracao configuracao;
    private TipoDeCafe tipoDeCafe;
    private UnidadeDePreparacao unidadeDePreparacao;

    @Override
    public void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina) {
        this.tipoDeMaquina = tipoDeMaquina;
    }

    @Override
    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    @Override
    public void setTipoDeCafe(TipoDeCafe tipoDeCafe) {
        this.tipoDeCafe = tipoDeCafe;
    }


    @Override
    public void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao) {
        this.unidadeDePreparacao = unidadeDePreparacao;
    }

    public MaquinaDeCafePremium getResult(){
        return new MaquinaDeCafePremium(tipoDeMaquina, configuracao, unidadeDePreparacao);
    }

    public BebidaDeCafe fazCafeFiltrado(){
        BebidaDeCafe bebidaDeCafe;
        return  bebidaDeCafe = new MaquinaDeCafeBasica(tipoDeMaquina, configuracao, unidadeDePreparacao).prepararCafeFiltrado(configuracao, tipoDeCafe);
    }

    public BebidaDeCafe fazCafeExpresso(){
        BebidaDeCafe bebidaDeCafe;
        return  bebidaDeCafe = new MaquinaDeCafePremium(tipoDeMaquina, configuracao, unidadeDePreparacao).prepararCafeExpresso(configuracao, tipoDeCafe);
    }

    public BebidaDeCafe fazCafeCappuccino(){
        BebidaDeCafe bebidaDeCafe;
        return  bebidaDeCafe = new MaquinaDeCafePremium(tipoDeMaquina, configuracao, unidadeDePreparacao).prepararCafeCappuccino(configuracao, tipoDeCafe);
    }

}
