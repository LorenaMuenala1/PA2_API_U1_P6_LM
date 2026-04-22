package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {

    public static class App implements QuarkusApplication {

        @Inject
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoRequest ambitoRequest;

        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;


        @Override
        public int run(String... args) {
            
            System.out.println("AmbitoAplicacion: " + this.ambitoAplicacion);
            this.ambitoAplicacion.incrementar();
            this.ambitoAplicacion.incrementar();
            this.ambitoAplicacion.incrementar();

            this.claseIntermedia.imprimirObjetoValor();

            /*  
            System.out.println("AmbitoRequest: ");
            System.out.println(this.ambitoRequest.incrementar());
            System.out.println(this.ambitoRequest.incrementar());
            System.out.println(this.ambitoRequest.incrementar());
*/

            //Ambito Dependent 
            System.out.println("--------Ambito Depent: --------------");
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());

            this.claseIntermedia.imprimirObjetoValorInject();

            System.out.println("--------Ambito Sinqleton: --------------");
            System.out.println(this.ambitoSingleton);
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());

            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }

    }

}
