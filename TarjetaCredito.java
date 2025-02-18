package org.example.practica1;

import java.util.ArrayList;

public class TarjetaCredito extends MetodoPago{

    private String nro_tarjeta;
    private ArrayList<TarjetaCredito> tipo;

    public TarjetaCredito(double importe, String nro_tarjeta) {
        super(importe);
        this.nro_tarjeta = nro_tarjeta;
        tipo = new ArrayList<>();
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con tarjeta de crédito VISA");
    }

    public boolean validarTarjeta(String nro_tarjeta){
        if (nro_tarjeta.length() != 16) {
            System.out.println("ERROR. Tiene que ser de 16 caracteres");
            return false;
        }
        return true;
    }
}
