package acm.talleres.taller1.ejercicio1.config;

import acm.talleres.taller1.ejercicio1.impl.AlertaCritica;
import acm.talleres.taller1.ejercicio1.impl.AlertaInformativa;
import acm.talleres.taller1.ejercicio1.impl.SistemaMonitoreoImp;
import acm.talleres.taller1.ejercicio1.interfaces.GeneradorAlerta;
import acm.talleres.taller1.ejercicio1.interfaces.SistemaMonitoreo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlertasConfig {

    @Bean
    public GeneradorAlerta generadorAlerta() {
        // Puedes cambiar AlertaCritica() por AlertaInformativa() para probar
        // return new AlertaInformativa();
        return new AlertaCritica();
    }

    @Bean
    public SistemaMonitoreo sistemaMonitoreo(GeneradorAlerta generadorAlerta) {
        return new SistemaMonitoreoImp(generadorAlerta);
    }
}
