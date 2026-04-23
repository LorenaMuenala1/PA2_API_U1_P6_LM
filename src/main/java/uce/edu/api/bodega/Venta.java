package uce.edu.api.bodega;

public class Venta {

    private String cliente;
    private Double total;

    public Venta(String cliente, Double total) {
        this.cliente = cliente;
        this.total = total;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

    

}
