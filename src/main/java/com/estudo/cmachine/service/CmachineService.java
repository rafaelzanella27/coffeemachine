package com.estudo.cmachine.service;

import com.estudo.cmachine.builders.MaquinaDeCafeBasicaBuilder;
import com.estudo.cmachine.builders.MaquinaDeCafePremiumBuilder;
import com.estudo.cmachine.components.BebidaDeCafe;
import com.estudo.cmachine.components.TipoDeCafe;
import com.estudo.cmachine.director.Director;
import org.springframework.stereotype.Service;

@Service
public class CmachineService {


    public BebidaDeCafe execute(String tipoCafe){
        MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder = new MaquinaDeCafeBasicaBuilder();
        MaquinaDeCafePremiumBuilder maquinaDeCafePremiumBuilder = new MaquinaDeCafePremiumBuilder();
        if (tipoCafe.equalsIgnoreCase("f")){
            Director director = new Director();
            director.construirMaquinaDeCafeBasica(maquinaDeCafeBasicaBuilder, TipoDeCafe.fromString(tipoCafe));
            return maquinaDeCafeBasicaBuilder.fazCafeFiltrado();
        }else if (tipoCafe.equalsIgnoreCase("e")){
            Director directorP = new Director();
            directorP.construirMaquinaDeCafePremium(maquinaDeCafePremiumBuilder, TipoDeCafe.fromString(tipoCafe));
            return maquinaDeCafePremiumBuilder.fazCafeExpresso();
        }
            Director directorP = new Director();
            directorP.construirMaquinaDeCafePremium(maquinaDeCafePremiumBuilder, TipoDeCafe.fromString(tipoCafe));
        return maquinaDeCafePremiumBuilder.fazCafeCappuccino();

    }
}
