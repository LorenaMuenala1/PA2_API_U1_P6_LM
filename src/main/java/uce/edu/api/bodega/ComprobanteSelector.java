package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    private ComprobantePDF comprobantePDF;
    @Inject
    private ComprobanteFisicoDigital comprobanteFisicoDigital;

    public Comprobante seleccionarComprobante(String destino) {
        if(destino != null){
            return comprobantePDF;
        }else{
            return comprobanteFisicoDigital;
        }
      
    }
}
