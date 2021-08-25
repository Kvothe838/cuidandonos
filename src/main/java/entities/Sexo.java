package entities;

import javax.persistence.*;

@Entity
@Table
public class Sexo {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }
}
