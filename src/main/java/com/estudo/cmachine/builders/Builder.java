package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.CafeEmGrao;
import com.estudo.cmachine.components.Configuracao;
import com.estudo.cmachine.components.UnidadeDePreparacao;
import com.estudo.cmachine.maquinas.TipoDeMaquina;


public interface Builder {

    void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina);
    void setConfiguracao(Configuracao configuracao);
    void setCafeEmGrao(CafeEmGrao cafeEmGrao);
    void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao);



}
