package org.example;

public class Recepcao extends SetorHotel {

    private static Recepcao recepcao = new Recepcao();

    private Recepcao() {};

    public static Recepcao getInstancia() {
        return recepcao;
    }
}