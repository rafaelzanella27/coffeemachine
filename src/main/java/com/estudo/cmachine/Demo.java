package com.estudo.cmachine;

import com.estudo.cmachine.builders.MaquinaDeCafeBasicaBuilder;
import com.estudo.cmachine.components.BebidaDeCafe;
import com.estudo.cmachine.components.TipoDeCafe;
import com.estudo.cmachine.director.Director;
import com.estudo.cmachine.maquinas.MaquinaDeCafeBasica;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder = new MaquinaDeCafeBasicaBuilder();

        director.construirMaquinaDeCafeBasica(maquinaDeCafeBasicaBuilder, TipoDeCafe.FILTRADO);

        MaquinaDeCafeBasica maquinaDeCafeBasica = maquinaDeCafeBasicaBuilder.getResult();
        System.out.println("Maquina utilizada: " + maquinaDeCafeBasica.getTipoDeMaquina());

        BebidaDeCafe bebidaDeCafe = maquinaDeCafeBasicaBuilder.fazCafeFiltrado();

        System.out.println(bebidaDeCafe);

    }
}
