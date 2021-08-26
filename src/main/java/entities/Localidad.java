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
    @JoinColumn(name="partido_id", referencedColumnName = "id")
    private Partido partido;

    public Localidad(){
        //Para que no se queje Hibernate
    }

    public String getNombre() {
        return nombre;
    }
}
