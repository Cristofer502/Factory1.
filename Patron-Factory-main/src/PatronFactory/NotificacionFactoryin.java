package PatronFactory;

public interface NotificacionFactoryin {
    EmailNotificacion CrearEmailNotificacion();
    SMSNotificacion CrearSMSNotificacion();
    AppNotificacion CrearAPPNotificacion();
}
