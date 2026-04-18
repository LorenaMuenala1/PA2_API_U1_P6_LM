package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail notificadorMail;
    @Inject
    private NotificadorSMS notificadorSMS;
    @Inject
    private NotificadorWhatsapp notificadorWhatsapp;

    public Notificador seleccionarNotificador(Double total) {
        if (total > 120) {
            return notificadorMail;
        } else if (total < 50) {
            return notificadorWhatsapp;
        } else {
            return notificadorSMS;
        }
    }
}
