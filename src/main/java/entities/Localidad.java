package entities;

import javax.persistence.*;

@Entity
@Table
public class Localidad {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;
    @ManyToOne
    private Partido partido;

    public String getNombre() {
        return nombre;
    }
}
