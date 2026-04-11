package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorMail{
     public void enviar(String correo, String mensaje){
 
        System.out.println("Se envia el mailal correo : "+correo);
        System.out.println("Con el mensaje: "+mensaje);
 
       
    }
   

}
