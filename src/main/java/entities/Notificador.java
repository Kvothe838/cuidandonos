package entities;

public class Notificador {
    private EstrategiaDeNotificacion estrategia;

    public void cambiarEstrategia(EstrategiaDeNotificacion estrategia){
        this.estrategia = estrategia;
    }

    public void notificar(Notificacion notificacion){
        this.estrategia.notificar(notificacion);
    }
}
