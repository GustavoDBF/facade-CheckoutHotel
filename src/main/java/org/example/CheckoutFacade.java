package org.example;

public class CheckoutFacade {

    public static boolean verificarPendenciasCheckout(Hospede hospede) {
        if (Frigobar.getInstancia().verificarHospedeComPendencia(hospede)) {
            return false;
        }
        if (Restaurante.getInstancia().verificarHospedeComPendencia(hospede)) {
            return false;
        }
        if (Recepcao.getInstancia().verificarHospedeComPendencia(hospede)) {
            return false;
        }
        return true;
    }
}