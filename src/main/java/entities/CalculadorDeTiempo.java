package entities;

import javax.persistence.*;

public class CalculadorDeTiempo {
    private int id;
    private AdapterCalculadorDistancia adapter;
    private Integer tiempoEnMinsPorMetro;

    public Integer tiempoAproxEnMinsEntre(Direccion direccion1, Direccion direccion2){
        return this.adapter.distanciaEnMetrosEntre(direccion1, direccion2) * this.tiempoEnMinsPorMetro;
    }
}
