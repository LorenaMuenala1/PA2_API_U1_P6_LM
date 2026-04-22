package uce.edu.api.Ticketshop;

import jakarta.inject.Singleton;

@Singleton
public class EmailService {

    public void enviar(String destinatario, String mensaje) {
        System.out.println("\n" + "------ENVIANDO EMAIL-------" );
        System.out.println("Para: " + destinatario);
        System.out.println(mensaje);
    }
}
