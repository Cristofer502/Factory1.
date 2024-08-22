package PatronFactory;

public class RegularNotificacionFactory implements NotificacionFactoryin {
    @Override
    public EmailNotificacion CrearEmailNotificacion() {
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion CrearSMSNotificacion() {
        return new SMSNotificacion();
    }

    @Override
    public AppNotificacion CrearAPPNotificacion() {
        return new AppNotificacion();
    }

}
