package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIVA implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el descuento del IVA...");
        Double valorADescontar = valor * 0.15; //12% de descuento
        return valor - valorADescontar; 
    }

}
