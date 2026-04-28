package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {

    private long tiempoInicio = 0;
    private long tiempoFin = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis(); // Registra el tiempo de inicio de la venta
    }

    /*public void reiniciar() {
        private long tiempoInicio = 0;
        private long tiempoFin = 0;
        this.tiempoInicio = 0;
        this.tiempoFin = 0;
    }*/



    public void finalizar() {
        this.tiempoFin =  System.currentTimeMillis();
        System.out.println("***TIEMPO EJECUCION*******"); 
        Long tiempoEjecucion = tiempoFin - this.tiempoInicio; 

        this.tiempoTotalAcumulado += tiempoEjecucion; // Acumula el tiempo total de todas las ventas
        this.numeroOperaciones++; // Incrementa el número de operaciones realizadas

        System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
        System.out.println("Tiempo acumulado: " + tiempoTotalAcumulado + " ms");
        System.out.println("Duración de la venta: " + this.numeroOperaciones);

    }
}
