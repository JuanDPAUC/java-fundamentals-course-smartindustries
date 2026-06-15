import java.util.Scanner; // Importamos la clase Scanner para leer datos ingresados por el usuario

public class CategorizarEdad { // Declaramos la clase principal llamada CategorizarEdad

    static String categoria(int edad) { // Método que recibe un entero (edad) y devuelve un String con la categoría

        if (edad < 12) { // Si la edad es menor a 12...
            return "Niño/a"; // ...se retorna "Niño/a"
        } else if (edad < 18) { // Si no es menor a 12, pero sí es menor a 18...
            return "Adolescente"; // ...se retorna "Adolescente"
        } else { // Si no se cumple ninguna de las condiciones anteriores (edad >= 18)...
            return "Adulto/a"; // ...se retorna "Adulto/a"
        }
    }

    public static void main(String[] args) { // Método main: punto de inicio del programa

        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner llamado "sc" para leer desde el teclado

        System.out.print("¿Cuál es tu nombre? "); // Preguntamos el nombre sin salto de línea
        String nombre = sc.nextLine(); // Leemos el nombre completo (incluye espacios) y lo guardamos en "nombre"

        System.out.print("¿Cuántos años tienes? "); // Preguntamos la edad sin salto de línea
        int edad = sc.nextInt(); // Leemos un número entero y lo guardamos en la variable "edad"
        sc.nextLine(); // Limpiamos el salto de línea que queda pendiente después de nextInt()

        String cat = categoria(edad); // Llamamos al método categoria() pasando la edad, y guardamos el resultado en "cat"

        System.out.println(nombre + ", tu categoría es: " + cat); // Mostramos el nombre junto con su categoría

        sc.close(); // Cerramos el Scanner porque ya no se leerán más datos
    }
}
