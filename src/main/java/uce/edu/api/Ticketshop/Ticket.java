package uce.edu.api.Ticketshop;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Ticket {

    public String generar(Usuario usuario, Concierto concierto, double total) {

        return "***** TICKET *****\n"
                + "Cliente: " + usuario.getNombre() + "\n"
                + "Evento: " + concierto.obtenerInfo() + "\n"
                + "Total: $" + total + "\n"
                + "******************";
    }
}