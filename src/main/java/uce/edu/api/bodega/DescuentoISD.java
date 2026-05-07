package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.annotation.Priority;


@ApplicationScoped
@Priority(3) 
public class DescuentoISD implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el descuento del ISD...");
        Double valorADescontar = valor * 0.10; //10% de descuento
        return valor - valorADescontar; 
    }

}
