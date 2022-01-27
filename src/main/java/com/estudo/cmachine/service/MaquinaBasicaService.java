package com.estudo.cmachine.service;

import com.estudo.cmachine.builders.Builder;
import com.estudo.cmachine.builders.MaquinaDeCafeBasicaBuilder;
import com.estudo.cmachine.components.BebidaDeCafe;
import com.estudo.cmachine.director.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaquinaBasicaService {

    @Autowired(required = false)
    private Builder builder;

    @Autowired(required = false)
    private Director director;

    @Autowired(required = false)
    private MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder;

    public BebidaDeCafe execute(){
        Director director = new Director();
        MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder = new MaquinaDeCafeBasicaBuilder();

        director.construirMaquinaDeCafeBasica(maquinaDeCafeBasicaBuilder);
        return maquinaDeCafeBasicaBuilder.fazCafeFiltrado();
    }
}
