package entities;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String apellido;
    private Direccion direccion;
    private LocalDate fechaNacimiento;
    private ReaccionIncidente formaDeReaccionAnteIncidentes;
    private String nombre;
    private Sexo sexo;
    private Usuario usuario;
    private String numeroTelefono;

    public Integer getEdad(){
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}
