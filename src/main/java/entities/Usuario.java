package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {
    @Column
    private String contrasenia;
    @Column
    private String nombreDeUsuario;
}
