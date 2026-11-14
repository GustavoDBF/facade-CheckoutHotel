package org.example;

public class Hospede {

    public boolean fazerCheckout() {
        return CheckoutFacade.verificarPendenciasCheckout(this);
    }
}