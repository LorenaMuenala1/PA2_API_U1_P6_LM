package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisicoDigital implements Comprobante {

    @Override
    public void generar(String destino) {
        System.out.println("Generando comprobante físico digital para el cliente: " + destino);
    }

}
