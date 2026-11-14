package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveRetornarPendenciaFrigobarCheckout() {
        Hospede hospede = new Hospede();
        Frigobar.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.fazerCheckout());
    }

    @Test
    void deveRetornarPendenciaRestauranteCheckout() {
        Hospede hospede = new Hospede();
        Restaurante.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.fazerCheckout());
    }

    @Test
    void deveRetornarPendenciaRecepcaoCheckout() {
        Hospede hospede = new Hospede();
        Recepcao.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.fazerCheckout());
    }

    @Test
    void deveRetornarHospedeSemPendenciaCheckout() {
        Hospede hospede = new Hospede();

        assertEquals(true, hospede.fazerCheckout());
    }
}