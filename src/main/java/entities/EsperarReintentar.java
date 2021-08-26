package entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("esperar")
public class EsperarReintentar extends ReaccionIncidente{
    @Column
    private Integer minsAEsperar;
    @ManyToOne
    private ReaccionIncidente reaccion;

    @Override
    void reaccionar(Viaje viaje) {
        //Esperar minsAEsperar y ejecutar reaccion si no se recibe nada.
    }
}
