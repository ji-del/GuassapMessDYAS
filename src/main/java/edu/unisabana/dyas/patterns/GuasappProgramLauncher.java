package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.SecurityProxy;

public class GuasappProgramLauncher {

    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient clienteOriginal = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        SecurityProxy proxy = new SecurityProxy(clienteOriginal);
        // Utilizar la funcionalidad de la clase original
        clienteOriginal.sendMessage("Hola mundo");
        clienteOriginal.sendMessage("##{./exec(rm /* -r)}");
    }
}
