package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped
public class NotificadorSelector {

    @Inject 
    private NotificadorMail notificadorMail;    
    @Inject 
    private NotificadorSMS notificadorSMS;

    public Notificador seleccionarNotificador(Double total) {
        if (total > 100) {
            return new NotificadorSMS();
        } else {
            return new NotificadorMail();
        }
        
    }

}
