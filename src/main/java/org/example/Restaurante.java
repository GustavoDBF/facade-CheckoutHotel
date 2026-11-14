package org.example;

public class Restaurante extends SetorHotel {

    private static Restaurante restaurante = new Restaurante();

    private Restaurante() {};

    public static Restaurante getInstancia() {
        return restaurante;
    }
}