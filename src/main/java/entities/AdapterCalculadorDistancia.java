package entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AdapterCalculadorDistancia {
    @Id
    @GeneratedValue
    private int id;
    abstract Integer distanciaEnMetrosEntre(Direccion direccion1, Direccion direccion2);
}
