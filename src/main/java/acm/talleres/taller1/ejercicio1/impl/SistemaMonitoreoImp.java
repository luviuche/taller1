package acm.talleres.taller1.ejercicio1.impl;

import acm.talleres.taller1.ejercicio1.interfaces.GeneradorAlerta;
import acm.talleres.taller1.ejercicio1.interfaces.SistemaMonitoreo;

public class SistemaMonitoreoImp implements SistemaMonitoreo {

    private final GeneradorAlerta generadorAlerta;

    public SistemaMonitoreoImp(GeneradorAlerta generadorAlerta) {
        this.generadorAlerta = generadorAlerta;
    }

    @Override
    public void ejecutarGeneracionAlertas() {
        System.out.println("--- Iniciando ciclo de monitoreo ---");
        String mensaje = generadorAlerta.generarMensajeAlerta();
        System.out.println("Resultado: " + mensaje);
        System.out.println("------------------------------------");
    }
}
