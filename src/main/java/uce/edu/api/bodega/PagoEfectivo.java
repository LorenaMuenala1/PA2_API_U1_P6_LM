package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo implements PagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("Presenta una pantalla ");
        System.out.println("Realizando pago en efectivo ");
    }

}
