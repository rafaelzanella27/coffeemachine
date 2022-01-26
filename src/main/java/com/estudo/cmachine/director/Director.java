package com.estudo.cmachine.director;

import com.estudo.cmachine.builders.Builder;
import com.estudo.cmachine.components.CafeEmGrao;
import com.estudo.cmachine.components.UnidadeDePreparacao;
import com.estudo.cmachine.maquinas.TipoDeMaquina;

public class Director {
    public void construirMaquinaDeCafeBasica(Builder builder){
        builder.setTipoDeMaquina(TipoDeMaquina.BASICA);
        //builder.setConfiguracao();
        //builder.setCafeEmGrao(new CafeEmGrao());
        builder.setUnidadeDePreparacao(new UnidadeDePreparacao());
    }
}
