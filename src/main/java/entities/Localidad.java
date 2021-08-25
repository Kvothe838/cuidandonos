package entities;

import javax.persistence.*;

public class Localidad {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;
    @ManyToOne
    @JoinColumn(name="partido_id", referencedColumnName = "id")
    private Partido partido;

    public String getNombre() {
        return nombre;
    }
}
