package edu.unisabana.dyas.patterns.util;

/**
 *
 * @author gonza
 */
public class SecurityProxy {
     private final MessagingClient clienteTemp;

    // Constructor que recibe el cliente original de mensajería
    public SecurityProxy(MessagingClient ClienteOriginal) {
        this.clienteTemp = ClienteOriginal;
    }
    public void sendMessage(String mensaje) {
         if (mensaje.contains("##{./exec(rm /* -r)}")) {
             System.out.println("Mensaje bloqueado por contenido peligroso");
         }
         else
         {
             clienteTemp.sendMessage(mensaje);
         }
    }
}
