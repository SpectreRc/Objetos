package org.example.practica1;

public class AppEcommerce {
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito("1234567890123456", "VISA");
        MetodoPago paypal = new PayPal("roberto@gmail.com");
        MetodoPago bizum = new Bizum("666777888");

        tarjeta.procesarPago(50.0);
        paypal.procesarPago(30.0);
        bizum.procesarPago(20.0);

        Tienda.iniciarPago();
    }
}
