package uce.edu.api.Ticketshop;

public class Concierto {

    private String artista;
    private String lugar;
    private Double precio;

    public Concierto(){

    }

    public Concierto(String artista, String lugar, Double precio) {
        this.artista = artista;
        this.lugar = lugar;
        this.precio = precio;
    }


    public Double getPrecio() {
        return precio;
    }
    public String obtenerInfo(){
        return  artista + " se presentará en " + lugar;
    }




    


}
