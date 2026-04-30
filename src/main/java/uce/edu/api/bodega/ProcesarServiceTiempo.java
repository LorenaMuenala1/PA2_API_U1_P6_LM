package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class ProcesarServiceTiempo {
   
    @Inject
    private EstadisticasVentasGlobales estadisticasGlobales;
   
    @MedirTiempo
     @Logs
    
    public void procesar(Venta venta) {

        System.out.println("\n " + "Procesando pedido......");
 
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        this.estadisticasGlobales.registrarPedido(venta.getTotal());
        System.out.println("\n " + "Final del pedido......");
        //this.reProcesar(venta);

    }

     @MedirTiempo
    public void reProcesar(Venta venta) {

        System.out.println("\n " + "ReProcesando pedido......");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        this.estadisticasGlobales.registrarPedido(venta.getTotal());
        System.out.println("\n " + "Finalizando el reproceso......");


    }



}
