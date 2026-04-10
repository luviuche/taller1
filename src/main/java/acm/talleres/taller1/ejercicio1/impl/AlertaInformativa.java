package acm.talleres.taller1.ejercicio1.impl;

import acm.talleres.taller1.ejercicio1.interfaces.GeneradorAlerta;

public class AlertaInformativa implements GeneradorAlerta {

    @Override
    public String generarMensajeAlerta() {
        return "INFO: El proceso de sincronización del sistema termino con éxito.";
    }
}
