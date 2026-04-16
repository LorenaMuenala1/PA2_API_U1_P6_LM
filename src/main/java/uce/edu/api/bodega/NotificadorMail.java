package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorMail implements Notificador {
     public void enviar(String destino, String mensaje){
 
        System.out.println("Se envia el mensaje al correo : "+ destino);
        System.out.println("Con el mensaje: "+mensaje);
 
    
    }
   

}
