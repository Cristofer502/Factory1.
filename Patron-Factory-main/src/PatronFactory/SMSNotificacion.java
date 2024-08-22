package PatronFactory;

public class SMSNotificacion implements AppNitificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por SMS");
    }

}
