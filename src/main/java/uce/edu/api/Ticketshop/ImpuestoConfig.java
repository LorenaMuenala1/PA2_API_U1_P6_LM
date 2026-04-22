package uce.edu.api.Ticketshop;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoConfig {

    private Double iva = 0.12;
    private Double servicios = 0.5;

   

    public Double getIva() {
        return iva;
    }

    public Double getServicios() {
        return servicios;
    }

}
