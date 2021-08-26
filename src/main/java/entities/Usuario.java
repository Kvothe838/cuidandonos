package entities;

import javax.persistence.*;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String contrasenia;
    @Column
    private String nombreDeUsuario;
}
