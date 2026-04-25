package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@ApplicationScoped
public class EstadisticasVentasGlobales {

    private Integer totalVentas = 0;
    private Double montoTotalVendido = 0.0;


    //Va registrando cad venta individual, actualizando el total de ventas y el monto total vendido
    public void registrarPedido(Double totalVentaIndividual) {
        this.totalVentas++;
        montoTotalVendido += totalVentaIndividual;
    }

    public void mostrarEstadisticasGlobales() {
        System.out.println("\n " + "**********ESTADISTICAS GLOBALES DE VENTAS **********");
        System.out.println("Total de ventas: " + this.totalVentas);
        System.out.println("Monto total vendido: " + this.montoTotalVendido);
    }

}
