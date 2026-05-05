package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.enterprise.inject.Instance;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos; //detecta todas las clases que implementen la 
                                            //interfaz descuento van a estar aqui 
                                            //y las va a tratar como una lista
    public void procesar(Compra compra) {
        System.out.println("\n " + "Procesando la compra...");

        Double total = compra.getSubTotal();
        for (Descuento des : descuentos) {

            total = des.aplicarDescuento(total); 
        }
            compra.setTotal(total);

            System.out.println("Su valor a pagar es : " + compra.getTotal());

       }
    }
