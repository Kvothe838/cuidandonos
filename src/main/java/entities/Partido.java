package entities;

import javax.persistence.*;

public class Partido {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;
    @ManyToOne
    @JoinColumn(name="provincia_id", referencedColumnName = "id")
    private Provincia provincia;

    public String getNombre() {
        return nombre;
    }
}
