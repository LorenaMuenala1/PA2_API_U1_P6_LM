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
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private EstadisticasVentasGlobales estadisticasGlobales;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Park Jimin", 150.0);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Jeon Jungkook", 132.0);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Kim Namjoon", 198.0);
            this.procesadorVentaService.procesar(v3);
            this.estadisticasGlobales.mostrarEstadisticasGlobales();

            return 0;
        }

    }

}
