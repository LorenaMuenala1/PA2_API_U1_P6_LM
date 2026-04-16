package uce.edu.api.bodega;

public class Pedido {
   private String cliente;
    private String producto;
    private String telefono;
    private double total;
    private String destino;
 
    public Pedido() {
    }
   
    public Pedido(String cliente, String producto, String telefono, double total, String correo) {
        this.cliente = cliente;
        this.producto = producto;
        this.telefono = telefono;
        this.total = total;
        this.destino = correo;
    }
 
    public String getCliente() {
        return cliente;
    }
 
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
 
    public String getProducto() {
        return producto;
    }
 
    public void setProducto(String producto) {
        this.producto = producto;
    }
 
    public double getTotal() {
        return total;
    }
 
    public void setTotal(double total) {
        this.total = total;
    }
 
    public String getDestino() {
        return destino;
    }
 
    public void setDestino(String correo) {
        this.destino = correo;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
