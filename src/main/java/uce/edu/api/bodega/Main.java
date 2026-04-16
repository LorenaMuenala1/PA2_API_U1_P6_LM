package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        /*
         * MODELO IoC
         * DI
         * 
         
         */

        // Lookup

        @Inject
        private PedidoService service;

        @Override
        public int run(String... args) throws Exception {

            PedidoService service = CDI.current().select(PedidoService.class).get();

            // pedido CASO 1
            Pedido p1 = new Pedido("Lorena", "Coca Cola", "09810012", 125.0, "lorena@example.com");
            service.registar(p1);

            // pedido CASO 2

            Pedido p2 = new Pedido("Ami", "Pesto", "098121212", 10450.0, "ami@example.com");
            service.registar(p2);

            // pedido <50 CASO 3
            Pedido p3 = new Pedido("Juli", "Pizza", "098565", 10.0, "juli@example.com");
            service.registar(p3);

            return 0;
        }
    }

}
