package acm.talleres.taller1.ejercicio1.impl;

import acm.talleres.taller1.ejercicio1.interfaces.GeneradorAlerta;

public class AlertaCritica implements GeneradorAlerta {

    @Override
    public String generarMensajeAlerta() {
        return "ALERTA CRITICA: Falla inminente en el sistema.";
    }
}
