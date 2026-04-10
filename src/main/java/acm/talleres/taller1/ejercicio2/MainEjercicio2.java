package acm.talleres.taller1.ejercicio2;

import acm.talleres.taller1.ejercicio2.servicio.ServicioConversion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEjercicio2 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 2");
        System.out.println("Iniciando escaneo automático de Spring...");

        ApplicationContext context = new AnnotationConfigApplicationContext("acm.talleres.taller1.ejercicio2");

        ServicioConversion servicio = context.getBean(ServicioConversion.class);
        servicio.ejecutarProceso(100);

        System.out.println("Fin de la ejecución.");
    }
}
