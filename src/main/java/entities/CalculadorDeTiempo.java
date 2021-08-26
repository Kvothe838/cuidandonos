package entities;

import javax.persistence.*;

@Entity
@Table
public class CalculadorDeTiempo {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private AdapterCalculadorDistancia adapter;
    @Column
    private Integer tiempoEnMinsPorMetro;

    public Integer tiempoAproxEnMinsEntre(Direccion direccion1, Direccion direccion2){
        return this.adapter.distanciaEnMetrosEntre(direccion1, direccion2) * this.tiempoEnMinsPorMetro;
    }
}
