package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import jakarta.persistence.criteria.CriteriaBuilder.In;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

    
        @Inject
        private ProcesarServiceTiempo procesadorTiempo;

        @Inject
        private InventarioService inventarioService;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Park Jimin", 150.0);
            this.procesadorTiempo.procesar(v1);
            //Venta v2 = new Venta("Park Jimin", 150.0);
            this.procesadorTiempo.reProcesar(v1);


            Pedido p1 = new Pedido("Park Jimin", "Bodega", "0999999999", 150.0,"jimin@gmial.com");
            this.inventarioService.RegistrarInventario(p1);

        
            return 0;
        }

    }

}
