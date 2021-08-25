package entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Viaje {
    @ManyToMany(mappedBy = "viaje", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Persona> cuidadores;
    @ManyToOne
    @JoinColumn(name="direccion_id", referencedColumnName = "id")
    private Direccion destino;
    @Column
    private Integer duracionEstimadaMin;
    @Column(columnDefinition = "DATE")
    private LocalDateTime fechaHoraInicio;
    @Column
    private Boolean finalizado;
    @ManyToOne
    @JoinColumn(name="direccion_id", referencedColumnName = "id")
    private Direccion origen;
    @ManyToOne
    @JoinColumn(name="persona_id", referencedColumnName = "id")
    private Persona transeunte;

    public List<Persona> getCuidadores() {
        return cuidadores;
    }

    public Persona getTranseunte() {
        return transeunte;
    }
}
