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
    @JoinColumn(name = "provincia_id", referencedColumnName = "id")
    private Provincia provincia;

    public Partido(){
        //Para que no se queje Hibernate
    }

    public String getNombre() {
        return nombre;
    }
}
