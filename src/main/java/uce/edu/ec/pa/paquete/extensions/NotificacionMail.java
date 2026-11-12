package uce.edu.ec.pa.paquete.extensions;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificacionMail implements Notificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Mensaje enviado a: " + destinatario);
        System.out.println("El mensaje fue: " + mensaje);
        System.out.println("Mensaje enviado por Correo de manera exitosa");
    }

}
