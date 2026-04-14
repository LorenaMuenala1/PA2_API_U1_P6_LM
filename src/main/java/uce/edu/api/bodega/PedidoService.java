package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    // DI inyectado por constructor
    /*private NotificadorMail notificadorMail;

    @Inject
    public PedidoService(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    }*/


    // DI inyectado por ATRIBUTO
    /*@Inject
    private NotificadorMail notificadorMail;
    */

    //DI por metodo setter -> menos usado
    /*private NotificadorMail notificadorMail;

    @Inject
    public void setNotificador(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    }*/

        @Inject
    private NotificadorSelector notificadorSelector;


    public void registar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
 
        //NotificadorMail n1 = new NotificadorMail(); SIN INYECCION DE DEPENDENCIAS

        //CON DI POR EL CONTENEDOR DE INYECCION DE DEPENDENCIAS
        //notificadorMail.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");// Lógica para registrar un pedido

        Notificador notificador = this.notificadorSelector.seleccionarNotificador(pedido.getTotal());

        notificador.enviar(pedido.getDestino(), "Se ha creado un pedido para ser atendido");
    }
}
