package PatronFactory;

public class AppNotificacion implements AppNitificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por medio de la Aplicacion");
    }
}
