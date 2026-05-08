package uce.edu.api.biblioteca;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class RecargoLibroPerdido implements CalculadorRecargo {

    @Override
    public Double aplicarRecargo(PrestamoLibro prestamo) {
        if (prestamo.isLibroPerdido()) {
            System.out.println("El libro está perdido. Aplicando recargo por pérdida.");
            return 50.0; // Recargo fijo por pérdida
        }
        return 0.0;
    }

    

}
