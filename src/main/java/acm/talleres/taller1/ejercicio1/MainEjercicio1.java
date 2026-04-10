package acm.talleres.taller1.ejercicio1;

import acm.talleres.taller1.ejercicio1.config.AlertasConfig;
import acm.talleres.taller1.ejercicio1.interfaces.SistemaMonitoreo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEjercicio1 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        System.out.println("Arrancando contenedor de Spring...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AlertasConfig.class);

        SistemaMonitoreo sistemaMonitoreo = context.getBean(SistemaMonitoreo.class);
        sistemaMonitoreo.ejecutarGeneracionAlertas();

        System.out.println("Fin de la ejecución.");
    }
}
