package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el impuesto del ICE...");
        Double valorAIncrementar = valor * 0.15; 
        return valor + valorAIncrementar; 
    }

}
