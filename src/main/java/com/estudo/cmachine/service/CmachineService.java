package com.estudo.cmachine.service;

import com.estudo.cmachine.builders.MaquinaDeCafeBasicaBuilder;
import com.estudo.cmachine.components.BebidaDeCafe;
import com.estudo.cmachine.components.TipoDeCafe;
import com.estudo.cmachine.director.Director;
import org.springframework.stereotype.Service;

@Service
public class CmachineService {


    public BebidaDeCafe execute(String tipoCafe){
        MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder = new MaquinaDeCafeBasicaBuilder();
        if (tipoCafe.equalsIgnoreCase("f")){
            Director director = new Director();

            director.construirMaquinaDeCafeBasica(maquinaDeCafeBasicaBuilder, TipoDeCafe.fromString(tipoCafe));

        }return maquinaDeCafeBasicaBuilder.fazCafeFiltrado();
    }
}
