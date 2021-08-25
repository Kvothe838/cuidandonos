package entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class EstrategiaDeNotificacion {
    abstract void notificar(Notificacion notificacion);
}
