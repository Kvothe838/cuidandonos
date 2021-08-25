package entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ReaccionIncidente {
    @Id
    @GeneratedValue
    private int id;
    abstract void reaccionar(Viaje viaje);
}
