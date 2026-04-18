package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF implements Comprobante {

    @Override
    public void generar(String destino) {
        System.out.println("Generando comprobante en formato PDF en la ruta: " + destino);
    }

}
