package entities;

import javax.persistence.*;

@Entity
@Table
public class Provincia {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;

    public Provincia(){
        //Para que no se queje Hibernate
    }

    public String getNombre() {
        return nombre;
    }
}
