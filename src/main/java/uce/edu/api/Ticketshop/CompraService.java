package uce.edu.api.Ticketshop;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CompraService {

    @Inject
    PrecioService precioService;

    @Inject
    EmailService emailService;

    @Inject
    Ticket ticket;

    public void comprar(Usuario usuario, Concierto concierto) {

        double total = precioService.calcular(concierto.getPrecio());

        String comprobante = ticket.generar(usuario, concierto, total);

        emailService.enviar(usuario.getEmail(), comprobante);
    }
}