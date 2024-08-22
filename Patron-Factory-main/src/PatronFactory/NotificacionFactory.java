package PatronFactory;

public class NotificacionFactory {


    public AppNitificacion CrearNotificacion(String TipoMensaje){
        switch (TipoMensaje.toLowerCase()) {
            case "email":
                return new EmailNotificacion();
            case "sms":
                return new SMSNotificacion();
            case "app":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("El tipo de notificación es desconocido: " + TipoMensaje);
        }
    }

}
