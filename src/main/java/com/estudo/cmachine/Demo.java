package com.estudo.cmachine;

import com.estudo.cmachine.builders.MaquinaDeCafeBasicaBuilder;
import com.estudo.cmachine.director.Director;
import com.estudo.cmachine.maquinas.MaquinaDeCafeBasica;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        MaquinaDeCafeBasicaBuilder maquinaDeCafeBasicaBuilder = new MaquinaDeCafeBasicaBuilder();

        director.construirMaquinaDeCafeBasica(maquinaDeCafeBasicaBuilder);

        MaquinaDeCafeBasica maquinaDeCafeBasica = maquinaDeCafeBasicaBuilder.getResult();
        System.out.println("Maquina built:\n" + maquinaDeCafeBasica.getTipoDeMaquina());
    }
}
