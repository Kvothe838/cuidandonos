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
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;
    @Column(columnDefinition = "DATE")
    private LocalDate fechaNacimiento;
    @ManyToOne
    @JoinColumn(name="reaccion_incidente_id", referencedColumnName = "id")
    private ReaccionIncidente formaDeReaccionAnteIncidentes;
    @Column
    private String nombre;
    @Column
    private Sexo sexo;
    @OneToOne
    @JoinColumn(name="usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @Column
    private String numeroTelefono;

    public Integer getEdad(){
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}
