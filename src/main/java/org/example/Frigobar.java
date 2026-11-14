package org.example;

public class Frigobar extends SetorHotel {

    private static Frigobar frigobar = new Frigobar();

    private Frigobar() {};

    public static Frigobar getInstancia() {
        return frigobar;
    }
}