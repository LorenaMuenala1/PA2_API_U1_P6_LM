package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService1 {

    public void registar(Pedido pedido) {
        System.out.println("registrando pedido");
    }
       
}
