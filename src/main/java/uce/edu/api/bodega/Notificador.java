package uce.edu.api.bodega;

public interface Notificador {
    
    //Me interesa el que y no el como, es decir, la implementación concreta de cada notificador
    void enviar(String destinatario, String mensaje);    

}
