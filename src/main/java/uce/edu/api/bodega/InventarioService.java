package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {

    @MedirTiempo
    public void RegistrarInventario(Pedido pedido) {

        System.out.println("\n " + "Registrando inventario......");
        //consultando el stock de cada item
        //consultando en la base de datos

        //voy a simular un proceso que tarda un tiempo, para que se note el tracking
        try {
            Thread.sleep(500); // Simula un proceso que tarda 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //registrando la venta en las estadísticas globales

        System.out.println("\n " + "Final del pedido......");


    }

}
