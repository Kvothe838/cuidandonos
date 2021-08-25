package entities;

public class EsperarReintentar extends ReaccionIncidente{
    private Integer minsAEsperar;
    private ReaccionIncidente reaccion;

    @Override
    void reaccionar(Viaje viaje) {
        //Esperar minsAEsperar y ejecutar reaccion si no se recibe nada.
    }
}
