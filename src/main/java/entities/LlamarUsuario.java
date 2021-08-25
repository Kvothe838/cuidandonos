package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("llamarUsuario")
public class LlamarUsuario extends ReaccionIncidente {
    @Override
    void reaccionar(Viaje viaje) {
        //Llama al usuario.
    }
}
