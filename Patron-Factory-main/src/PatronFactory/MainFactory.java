package PatronFactory;

public class MainFactory {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();

        AppNitificacion email = factory.CrearNotificacion("email");
        email.enviarMensaje("Mensaje por correo");

        AppNitificacion sms = factory.CrearNotificacion("sms");
        sms.enviarMensaje("Mensaje por sms");

        AppNitificacion app = factory.CrearNotificacion("app");
        app.enviarMensaje("Mensaje por la app");

        NotificacionFactoryin urgenteFactory = new UrgenteNotificacionFactory();
        AppNitificacion urgenteEmail = urgenteFactory.CrearEmailNotificacion();
        urgenteEmail.enviarMensaje("mensaje urgente por email");

        NotificacionFactoryin regularFactory = new RegularNotificacionFactory();
        SMSNotificacion regularSMS = regularFactory.CrearSMSNotificacion();
        regularSMS.enviarMensaje("Mensaje regular por mensaje");
    }
}
