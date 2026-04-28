package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class ProcesarServiceTiempo {
   
    @Inject
    private EstadisticasVentasGlobales estadisticasGlobales;

    @MedirTiempo

    public void procesar(Venta venta) {

        System.out.println("\n " + "Procesando pedido......");
        //consultando el stock de cada item
        //consultando en la base de datos

        //voy a simular un proceso que tarda un tiempo, para que se note el tracking
        try {
            Thread.sleep(100); // Simula un proceso que tarda 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //registrando la venta en las estadísticas globales
        this.estadisticasGlobales.registrarPedido(venta.getTotal());
        System.out.println("\n " + "Final del pedido......");


    }

     @MedirTiempo
    public void reProcesar(Venta venta) {

        System.out.println("\n " + "ReProcesando pedido......");
        //consultando el stock de cada item
        //consultando en la base de datos

        //voy a simular un proceso que tarda un tiempo, para que se note el tracking
        try {
            Thread.sleep(500); // Simula un proceso que tarda 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //registrando la venta en las estadísticas globales
        this.estadisticasGlobales.registrarPedido(venta.getTotal());
        System.out.println("\n " + "Finalizando el reproceso......");


    }



}
