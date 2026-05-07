package uce.edu.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2) 
public class DescuentoSOLCA implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el descuento del SOLCA...");
        Double valorADescontar = valor * 0.05; //5% de descuento
        return valor - valorADescontar; 
    }

}
