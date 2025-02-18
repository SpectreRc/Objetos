package org.example.suscripciones;

public class AppSuscripciones {
    public static void main(String[] args) {

        Suscripcion gratis = new PlanGratis("Gratis", 0);
        Suscripcion basico = new PlanBasico("Básico", 10);
        Suscripcion premium = new PlanPremium("Premium", 20);
        Suscripcion familiar = new PlanFamiliar("Familiar", 30);

        Suscripcion[] suscripciones = {new PlanGratis("Gratis", 0), new PlanBasico("Básico", 10), new PlanPremium("Premium", 20), new PlanFamiliar("Familiar", 30)};
        for(Suscripcion subs : suscripciones){
            subs.mostrarInfo();
            subs.obtenerBeneficios();
        }
    }
}
