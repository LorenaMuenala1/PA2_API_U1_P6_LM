package uce.edu.api.Ticketshop;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main1 {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        CompraService compraService;


        
        @Override
        public int run(String... args) {

            Concierto concierto1 = new Concierto(
                    "BTS",
                    "Estadio Nacional",
                    1320.56);
            
            Usuario usuario1 = new Usuario("Lorena", "lorena@email.com");

            Concierto concierto2 = new Concierto(
                    "StrayKids",
                    "Estadio Atahualpa",
                    1045.56);
            
            Usuario usuario2 = new Usuario("Sami", "sami@email.com");

            compraService.comprar(usuario1, concierto1);
            compraService.comprar(usuario2, concierto2);



            return 0;
        }

    }

}
