package org.example.practica1;

public abstract class MetodoPago {

    private double importe;

    public MetodoPago(double importe){
        this.importe = importe;
    }

    public abstract void procesarPago();
}
