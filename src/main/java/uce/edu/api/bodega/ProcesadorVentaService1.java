package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ProcesadorVentaService1 {
     //Aqui como inyecto tracking venta se crea un objeto 
    @Inject
    private TrackingVenta tracking;

    @Inject
    private EstadisticasVentasGlobales estadisticasGlobales;

    public void procesar(Venta venta) {

        //inicia la venta
        this.tracking.iniciar();

        System.out.println("\n " + "Procesando la venta...");
        //consultando el stock de cada item
        //consultando en la base de datos

        //voy a simular un proceso que tarda un tiempo, para que se note el tracking
        try {
            Thread.sleep(200); // Simula un proceso que tarda 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //finalizando la venta
        this.tracking.finalizar();

        //registrando la venta en las estadísticas globales
        this.estadisticasGlobales.registrarPedido(venta.getTotal());

    }


}
