package entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Viaje {
    @Id
    @GeneratedValue
    private int id;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Persona> cuidadores;
    @ManyToOne
    private Direccion destino; //one to one
    @Column
    private Integer duracionEstimadaMin;
    @Column(columnDefinition = "DATE")
    private LocalDateTime fechaHoraInicio;
    @Column
    private Boolean finalizado;
    @ManyToOne
    private Direccion origen;
    @ManyToOne
    private Persona transeunte;

    //Constructor vacío siempre.

    public Viaje(Direccion origen, Direccion destino, List<Persona> cuidadores, Persona transeunte){
        this.origen = origen;
        this.destino = destino;
        this.cuidadores = cuidadores;
        this.transeunte = transeunte;
        this.finalizado = false;
    }

    public List<Persona> getCuidadores() {
        return cuidadores;
    }

    public Persona getTranseunte() {
        return transeunte;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }
}
