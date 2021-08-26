package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

public class LlamarPolicia extends ReaccionIncidente{

    @Override
    void reaccionar(Viaje viaje) {
        //Llama a la policía.
    }
}
