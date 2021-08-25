package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Viaje {
    private List<Persona> cuidadores;
    private Direccion destino;
    private Integer duracionEstimadaMin;
    private LocalDateTime fechaHoraInicio;
    private Boolean finalizado;
    private Direccion origen;
    private Persona transeunte;

    public List<Persona> getCuidadores() {
        return cuidadores;
    }

    public Persona getTranseunte() {
        return transeunte;
    }
}
