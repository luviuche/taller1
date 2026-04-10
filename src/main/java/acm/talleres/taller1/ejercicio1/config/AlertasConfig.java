package acm.talleres.taller1.ejercicio1.config;

import acm.talleres.taller1.ejercicio1.impl.AlertaCritica;
import acm.talleres.taller1.ejercicio1.impl.SistemaMonitoreoImp;
import acm.talleres.taller1.ejercicio1.interfaces.GeneradorAlerta;
import acm.talleres.taller1.ejercicio1.interfaces.SistemaMonitoreo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlertasConfig {

    @Bean
    public GeneradorAlerta generadorAlerta() {
        return new AlertaCritica();
    }

    @Bean
    public SistemaMonitoreo sistemaMonitoreo(GeneradorAlerta generadorAlerta) {
        return new SistemaMonitoreoImp(generadorAlerta);
    }
}
