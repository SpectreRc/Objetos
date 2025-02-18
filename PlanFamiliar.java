package org.example.suscripciones;

public class PlanFamiliar extends Suscripcion{

    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }
}
