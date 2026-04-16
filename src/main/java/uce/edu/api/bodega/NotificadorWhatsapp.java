package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorWhatsapp implements Notificador{
        public void enviar(String destino, String mensaje){
            System.out.println("Se envia el whatsapp al numero : "+ destino);
            System.out.println("Con el mensaje: "+ mensaje);

        }

}
