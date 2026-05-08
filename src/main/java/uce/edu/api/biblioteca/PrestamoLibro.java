package uce.edu.api.biblioteca;

public class PrestamoLibro {

    private String usuario;
    private String tituloLibro;
    private Boolean libroRoto;
    private Boolean libroPerdido;

    private Double multa;

    public PrestamoLibro() {
    }

    public PrestamoLibro(String usuario,
                     String tituloLibro,
                     Boolean libroRoto,
                     Boolean libroPerdido,
                     Double multa) {

        this.usuario = usuario;
        this.tituloLibro = tituloLibro;
        this.libroRoto = libroRoto;
        this.libroPerdido = libroPerdido;
        this.multa = multa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public Boolean isLibroRoto() {
        return libroRoto;
    }

    public void setLibroRoto(Boolean libroRoto) {
        this.libroRoto = libroRoto;
    }

    public Boolean isLibroPerdido() {
        return libroPerdido;
    }

    public void setLibroPerdido(Boolean libroPerdido) {
        this.libroPerdido = libroPerdido;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }
}