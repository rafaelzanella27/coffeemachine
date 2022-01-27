package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.*;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public interface Builder {

    void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina);
    void setConfiguracao(Configuracao configuracao);
    void setCafeMoido(CafeMoido cafeMoido);
    void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao);



}
