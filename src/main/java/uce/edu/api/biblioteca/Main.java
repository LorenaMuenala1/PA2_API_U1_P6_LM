package uce.edu.api.biblioteca;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;


public class Main {
        public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

    
        @Inject 
        private ProcesadorMultaService procesadorMultaService;

        @Override
        public int run(String... args) throws Exception {

          PrestamoLibro prestamo1 = new PrestamoLibro("Kim Taehyung","Boulevard" ,true,false,120.0);
          this.procesadorMultaService.procesar(prestamo1);

           PrestamoLibro prestamo2 = new PrestamoLibro("Maria Suntaxi","Cenicienta" ,true,true,100.0);
          this.procesadorMultaService.procesar(prestamo2);

    
            return 0;
        }

    }

}



