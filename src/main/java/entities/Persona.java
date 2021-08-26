package entities;

import converters.ReaccionIncidenteAttributeConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String apellido;
    @OneToOne
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion; //one to one porque se pierde muchos recursos buscando la instancia de la direccion existente al instanciar una nueva persona.
    @Column(columnDefinition = "DATE")
    private LocalDate fechaNacimiento;
    @Column
    @Convert(converter = ReaccionIncidenteAttributeConverter.class)
    private ReaccionIncidente formaDeReaccionAnteIncidentes;

    //Se agregan atributos de EsperarReintentar ya que se usa converter.
    @Column
    private Integer minsAEsperar;
    @ElementCollection
    @Convert(converter = ReaccionIncidenteAttributeConverter.class)
    private List<ReaccionIncidente> reaccionesEsperarReintentar;

    @Column
    private String nombre;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Sexo sexo;
    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @Column
    private String numeroTelefono;

    public Persona(){
        //Para que no se queje Hibernate
    }

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
