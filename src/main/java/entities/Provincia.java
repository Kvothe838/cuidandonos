package entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Provincia {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;

    public String getNombre() {
        return nombre;
    }
}
