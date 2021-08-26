package entities;

import javax.persistence.*;

@Entity
@Table
public class Partido {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;
    @ManyToOne
    private Provincia provincia;

    public String getNombre() {
        return nombre;
    }
}
