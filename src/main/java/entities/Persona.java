package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String apellido;
    @ManyToOne
    private Direccion direccion;
    @Column(columnDefinition = "DATE")
    private LocalDate fechaNacimiento;
    @ManyToOne
    private ReaccionIncidente formaDeReaccionAnteIncidentes;
    @Column
    private String nombre;
    @ManyToOne
    private Sexo sexo;
    @OneToOne
    private Usuario usuario;
    @Column
    private String numeroTelefono;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getEdad(){
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}
