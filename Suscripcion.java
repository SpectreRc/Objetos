package org.example.suscripciones;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("El plan que has contratado es " + nombrePlan + " con el precio de " + precio);
    }

    public abstract void obtenerBeneficios();
}
