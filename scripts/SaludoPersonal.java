import java.util.Scanner; // Importamos la clase Scanner para poder leer datos que escriba el usuario

public class SaludoPersonal { // Declaramos la clase principal llamada SaludoPersonal

    public static void main(String[] args) { // Método main: punto de inicio del programa

        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner llamado "sc" para leer desde el teclado

        System.out.print("¿Cómo te llamas? "); // Mostramos un mensaje en pantalla sin salto de línea, pidiendo el nombre
        String nombre = sc.nextLine(); // Leemos lo que el usuario escribe y lo guardamos en la variable "nombre"

        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso de Java."); // Saludamos al usuario usando su nombre

        sc.close(); // Cerramos el Scanner porque ya no vamos a leer más datos
    }
}
