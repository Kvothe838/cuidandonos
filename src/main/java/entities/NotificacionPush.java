package entities;

public class NotificacionPush extends EstrategiaDeNotificacion{
    private AdapterNotifiacionPush adapter;

    @Override
    void notificar(Notificacion notificacion) {
        this.adapter.notificar(notificacion);
    }
}
