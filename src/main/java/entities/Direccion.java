package entities;

import javax.persistence.*;

@Entity
@Table
public class Direccion {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String calle;
    @ManyToOne
    @JoinColumn(name="localidad_id", referencedColumnName = "id")
    private Localidad localidad;
    @Column
    private Integer nro;

    public Direccion(String calle, Integer nro){
        this.calle = calle;
        this.nro = nro;
    }

    public String direccionCompleta(){
        return this.calle + " " + this.nro + ", " + this.localidad.getNombre();
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
