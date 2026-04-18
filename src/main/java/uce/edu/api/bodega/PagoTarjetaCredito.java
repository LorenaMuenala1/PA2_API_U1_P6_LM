package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoTarjetaCredito implements PagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("Presenta la pantalla donde pide los datos de la tarjeta de credito");
        System.out.println("Realizando pago con tarjeta de credito ");
    }

}
