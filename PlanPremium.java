package org.example.suscripciones;

public class PlanPremium extends Suscripcion{

    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargar offline.");
    }
}
