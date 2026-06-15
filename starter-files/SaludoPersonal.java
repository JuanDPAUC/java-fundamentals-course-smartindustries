import java.util.Scanner; // Importamos la clase Scanner para poder leer datos que escriba el usuario
 
public class SaludoPersonal { // Declaramos la clase principal llamada SaludoPersonal
 
    public static void main(String[] args) { // Método main: punto de inicio del programa
 
        // PASO 1: Creamos un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);
 
        // PASO 2: Mostramos un mensaje pidiendo el nombre y lo leemos
        System.out.print("¿Cómo te llamas? "); // Mensaje sin salto de línea
        String nombre = sc.nextLine(); // Guardamos lo que escribe el usuario en "nombre"
 
        // PASO 3: Mostramos un saludo personalizado usando el nombre ingresado
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso de Java.");
 
        // PASO 4: Cerramos el Scanner porque ya no vamos a leer más datos
        sc.close();
    }
}