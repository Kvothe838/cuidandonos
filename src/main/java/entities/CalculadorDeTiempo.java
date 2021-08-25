package entities;

import javax.persistence.*;

@Entity
@Table
public class CalculadorDeTiempo {
    @ManyToOne
    @JoinColumn(name="adapter_id", referencedColumnName = "id")
    private AdapterCalculadorDistancia adapter;
    @Column
    private Integer tiempoEnMinsPorMetro;

    public Integer tiempoAproxEnMinsEntre(Direccion direccion1, Direccion direccion2){
        return this.adapter.distanciaEnMetrosEntre(direccion1, direccion2) * this.tiempoEnMinsPorMetro;
    }
}
