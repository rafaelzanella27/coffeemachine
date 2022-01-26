package com.estudo.cmachine.builders;

import com.estudo.cmachine.components.CafeEmGrao;
import com.estudo.cmachine.components.Configuracao;
import com.estudo.cmachine.components.TipoDeCafe;
import com.estudo.cmachine.components.UnidadeDePreparacao;
import com.estudo.cmachine.maquinas.TipoDeMaquina;

import java.util.Map;

public interface Builder {

    void setTipoDeMaquina(TipoDeMaquina tipoDeMaquina);
    void setConfiguracao(Map<TipoDeCafe, Configuracao> mapDeConfiguracao);
    void setCafeEmGrao(CafeEmGrao cafeEmGrao);
    void setUnidadeDePreparacao(UnidadeDePreparacao unidadeDePreparacao);

}
