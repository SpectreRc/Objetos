package org.example.practica1;

public class TarjetaCredito extends MetodoPago{

    private String nro_tarjeta;
    private String tipo[] = {"VISA", "MASTERCARD", "MAESTRO"};

    public TarjetaCredito(double importe) {
        super(importe);
    }

    public void procesarPago() {

    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con tarjeta de crédito VISA");
    }

    public void validarTarjeta(){
        
    }
}
