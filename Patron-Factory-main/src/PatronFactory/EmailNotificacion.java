package PatronFactory;

public class EmailNotificacion implements AppNitificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("El mrensaje fue enviado por email");
    }
}
