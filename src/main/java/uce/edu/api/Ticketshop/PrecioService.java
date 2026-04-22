package uce.edu.api.Ticketshop;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PrecioService {

    @Inject
    private ImpuestoConfig config;

   public Double calcular(double base) {
    return base + (base * config.getIva()) + (base * config.getServicios());

  }
}
