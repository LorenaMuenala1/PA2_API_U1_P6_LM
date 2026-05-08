package uce.edu.api.biblioteca;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class RecargoLibroRoto implements CalculadorRecargo {

    @Override
    public Double aplicarRecargo(PrestamoLibro prestamo) {
        if (prestamo.isLibroRoto()) {
            System.out.println("El libro está roto. Aplicando recargo por daño.");
            return 20.0; // Recargo fijo por daño
        }
        return 0.0;
    }

}
