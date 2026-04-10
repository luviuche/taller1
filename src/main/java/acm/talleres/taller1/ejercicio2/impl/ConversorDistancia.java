package acm.talleres.taller1.ejercicio2.impl;

import acm.talleres.taller1.ejercicio2.interfaces.Conversor;
import org.springframework.stereotype.Component;

@Component("conversorDistancia")
public class ConversorDistancia implements Conversor {

    @Override
    public double convertir(double valor) {
        // Fórmula: Kilómetros * 0.621371 = Millas
        return valor * 0.621371;
    }
}
