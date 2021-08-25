package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("msj")
public class EnviarMsjAlertaCuidadores extends ReaccionIncidente {

    @Override
    public void reaccionar(Viaje viaje){
        Notificador notificador = new Notificador();
        notificador.cambiarEstrategia(new NotificacionWPP());

        List<Persona> cuidadores = viaje.getCuidadores();
        cuidadores.forEach(cuidador -> {
            Notificacion notificacion = new Notificacion();
            notificacion.emisor = "nùmero de Twillio";
            notificacion.receptor = cuidador.getNumeroTelefono();

            notificador.notificar(notificacion);
        });


    }
}
