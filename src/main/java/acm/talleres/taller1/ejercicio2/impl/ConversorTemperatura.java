package acm.talleres.taller1.ejercicio2.impl;

import acm.talleres.taller1.ejercicio2.interfaces.Conversor;
import org.springframework.stereotype.Component;

@Component("conversorTemperatura")
public class ConversorTemperatura implements Conversor {

    @Override
    public double convertir(double valor) {
        // Fórmula: (Celsius * 9/5) + 32 = Fahrenheit
        return (valor * 9 / 5) + 32;
    }
}
