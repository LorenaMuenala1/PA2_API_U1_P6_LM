package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService service;

        @Inject
        private PagoTarjetaCredito pagoTarjetaCredito;

        @Inject
        private PagoEfectivo pagoEfectivo;

        @Inject
        private ComprobanteSelector se;

      

@Override
public int run(String... args) {

    System.out.println("---------------------------------------\n");
    Pedido p1 = new Pedido("Lorena", "Coca Cola", "09810012", 125.0, "lorena@example.com");
    service.registar(p1, pagoTarjetaCredito);

    System.out.println("---------------------------------------\n");
    Pedido p2 = new Pedido("Ami", "Pesto", "098121212", 10450.0, "ami@example.com");
    service.registar(p2, pagoEfectivo);

    System.out.println("---------------------------------------\n");
    Pedido p3 = new Pedido("Juli", "Pizza", "098565", 10.0, null);
    service.registar(p3, pagoEfectivo);

    return 0;
}
    }

}
