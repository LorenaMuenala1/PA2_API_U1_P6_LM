package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Aranceles implements Descuento {

    @Override
    public Double aplicarDescuento(Double valor) {
        System.out.println("Aplicando el arancel...");
        //El arancel es un impuesto que se aplica a los productos importados, con el objetivo de proteger la industria nacional y generar ingresos para el gobierno. 
        Double valorAIncrementar = valor * 0.20; 
        return valor + valorAIncrementar; 
    }

}
