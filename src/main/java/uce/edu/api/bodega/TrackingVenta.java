package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {
    private long tiempoInicio = 0;
    private long tiempoFin = 0;

    public void iniciar() {
        this.tiempoInicio = this.tiempoInicio + System.currentTimeMillis(); // Registra el tiempo de inicio de la venta
    }

    public void finalizar() {
        this.tiempoFin = this.tiempoFin + System.currentTimeMillis();
        System.out.println("***TIEMPO EJECUCION*******"); 
        Long duracion = tiempoFin - this.tiempoInicio; 
        System.out.println("Duración de la venta: " + duracion + " ms");
    }
}
