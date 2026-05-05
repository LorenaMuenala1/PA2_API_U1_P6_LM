package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoBlackFriday implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el descuento del Black Friday...");
        Double valorADescontar = valor * 0.50; //20% de descuento
        return valor - valorADescontar; 
    }

}
