package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoFODINFA implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el impuesto del FODINFA...");
        Double valorAIncrementar = valor * 0.05; 
        return valor + valorAIncrementar; 
    }

}
