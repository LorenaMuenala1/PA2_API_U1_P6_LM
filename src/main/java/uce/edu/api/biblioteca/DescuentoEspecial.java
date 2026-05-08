package uce.edu.api.biblioteca;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
@Priority(3)
public class DescuentoEspecial implements CalculadorRecargo {

    @Override
    public Double aplicarRecargo(PrestamoLibro prestamo) {
        if (prestamo.getUsuario().toLowerCase().contains("maria")) {
            System.out.println("Felicidades es tu dia Maria. Obtienes un  descuento especial.");
            Double descuento = prestamo.getMulta() * 0.5;
            return  - descuento; // Descuento del 50% para usuarios con "Maria" en su nombre
        }else{
            return 0.0;
        }
    }

}
