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

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaEnLinea procesadorVentaEnLinea;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Park Jimin", 150.0);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Jeon Jungkook", 132.0);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Kim Namjoon", 198.0);
            this.procesadorVentaService.procesar(v3);


            Venta v4 = new Venta("Min Yoongi", 198.0);
            this.procesadorVentaService1.procesar(v4);

            Venta v5 = new Venta("Min Yoongi", 198.0);
            this.procesadorVentaService1.procesar(v5);

            Venta v6 = new Venta("Jeon Jungkook", 1986.0);
            this.procesadorVentaEnLinea.procesar(v6);


            this.estadisticasGlobales.mostrarEstadisticasGlobales();

            return 0;
        }

    }

}
