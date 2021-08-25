package entities;

public class Direccion {
    private String calle;
    private Localidad localidad;
    private Integer nro;

    public String direccionCompleta(){
        return this.calle + " " + this.nro + ", " + this.localidad.getNombre();
    }
}
