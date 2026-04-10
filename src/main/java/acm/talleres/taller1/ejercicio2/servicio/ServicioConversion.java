package acm.talleres.taller1.ejercicio2.servicio;

import acm.talleres.taller1.ejercicio2.interfaces.Conversor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServicioConversion {

    private final Conversor conversor;

    // Usamos @Qualifier para elegir entre "conversorTemperatura" o "conversorDistancia"
    public ServicioConversion(@Qualifier("conversorTemperatura") Conversor conversor) {
        this.conversor = conversor;
    }

    public void ejecutarProceso(double valorAConvertir) {
        System.out.println("--- Iniciando proceso de conversion ---");
        double resultado = conversor.convertir(valorAConvertir);
        System.out.println("Valor original: " + valorAConvertir);
        System.out.println("Resultado de la conversión: " + resultado);
        System.out.println("---------------------------------------");
    }
}
