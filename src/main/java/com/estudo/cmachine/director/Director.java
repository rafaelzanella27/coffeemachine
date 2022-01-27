package com.estudo.cmachine.director;

import com.estudo.cmachine.builders.Builder;
import com.estudo.cmachine.components.CafeEmGrao;
import com.estudo.cmachine.components.Configuracao;
import com.estudo.cmachine.components.UnidadeDePreparacao;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public class Director {
    public void construirMaquinaDeCafeBasica(Builder builder){
        builder.setTipoDeMaquina(TipoDeMaquina.BASICA);
        builder.setConfiguracao(new Configuracao(30,480));
        builder.setCafeEmGrao(new CafeEmGrao("Melita", 1));
        builder.setUnidadeDePreparacao(new UnidadeDePreparacao());
    }

//    public void construirMaquinaDeCafePremium(Builder builder){
//        builder.setTipoDeMaquina(TipoDeMaquina.PREMIUM);
//        builder.setConfiguracao(new Configuracao(30,480));
//        builder.setCafeEmGrao(new CafeEmGrao("curto", 1));
//        builder.setUnidadeDePreparacao(new UnidadeDePreparacao());
//    }
}
