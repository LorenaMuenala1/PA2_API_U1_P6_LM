package uce.edu.api.biblioteca;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@Monitoreo
@ApplicationScoped
public class ProcesadorMultaService {

    @Inject
    private Instance<CalculadorRecargo> recargos;

    public void procesar(PrestamoLibro prestamo) {

        System.out.println(
                "\nProcesando multa...");

        Double total = prestamo.getMulta();

        for (CalculadorRecargo calc : recargos) {
            prestamo.setMulta(total);
            total += calc.aplicarRecargo(prestamo);

        }
        prestamo.setMulta(total);

        System.out.println( "El total de la multa es: "+ prestamo.getMulta());
    }
}