package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("distanteMatrixApi")
public class DistanceMatrixApi extends AdapterCalculadorDistancia{
    @Override
    Integer distanciaEnMetrosEntre(Direccion direccion1, Direccion direccion2) {
        return 0;
    }
}
