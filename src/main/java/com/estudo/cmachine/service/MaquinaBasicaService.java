package com.estudo.cmachine.service;

import com.estudo.cmachine.builders.MaquinaDeCafeBasicaBuilder;
import com.estudo.cmachine.components.BebidaDeCafe;
import com.estudo.cmachine.director.Director;
import org.springframework.stereotype.Service;

@Service
public class MaquinaBasicaService {


    public BebidaDeCafe execute(){
        Director director = new Director();
        MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder = new MaquinaDeCafeBasicaBuilder();

        director.construirMaquinaDeCafeBasica(maquinaDeCafeBasicaBuilder);

        return maquinaDeCafeBasicaBuilder.fazCafeFiltrado();
    }
}
