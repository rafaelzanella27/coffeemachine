package com.estudo.cmachine.director;

import com.estudo.cmachine.builders.Builder;
import com.estudo.cmachine.components.*;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public class Director {
    public void construirMaquinaDeCafeBasica(Builder builder, TipoDeCafe tipoDeCafe){
        builder.setTipoDeMaquina(TipoDeMaquina.BASICA);
        builder.setConfiguracao(new Configuracao(30,480));
        builder.setTipoDeCafe(tipoDeCafe);
        builder.setUnidadeDePreparacao(new UnidadeDePreparacao());
    }

    public void construirMaquinaDeCafePremium(Builder builder, TipoDeCafe tipoDeCafe){
        builder.setTipoDeMaquina(TipoDeMaquina.PREMIUM);
        builder.setConfiguracao(new Configuracao(30,480));
        builder.setTipoDeCafe(tipoDeCafe);
        builder.setUnidadeDePreparacao(new UnidadeDePreparacao());
    }
}
