import java.util.Scanner; // Importamos la clase Scanner para leer datos ingresados por el usuario
 
public class CategorizarEdad { // Declaramos la clase principal llamada CategorizarEdad
 
    // PASO 1: Definimos un método que recibe un entero (edad) y devuelve un String con la categoría
    static String categoria(int edad) {
 
        if (edad < 12) { // Si la edad es menor a 12...
            return "Niño/a"; // ...se retorna "Niño/a"
        } else if (edad < 18) { // Si no es menor a 12, pero sí es menor a 18...
            return "Adolescente"; // ...se retorna "Adolescente"
        } else { // Si no se cumple ninguna de las condiciones anteriores (edad >= 18)...
            return "Adulto/a"; // ...se retorna "Adulto/a"
        }
    }
 
    public static void main(String[] args) { // Método main: punto de inicio del programa
 
        // PASO 2: Creamos un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);
 
        // PASO 3: Preguntamos el nombre y lo leemos
        System.out.print("¿Cuál es tu nombre? "); // Mensaje sin salto de línea
        String nombre = sc.nextLine(); // Leemos el nombre completo (incluye espacios)
 
        // PASO 4: Preguntamos la edad y la leemos como número entero
        System.out.print("¿Cuántos años tienes? "); // Mensaje sin salto de línea
        int edad = sc.nextInt(); // Guardamos el número ingresado en "edad"
        sc.nextLine(); // Limpiamos el salto de línea pendiente después de nextInt()
 
        // PASO 5: Llamamos al método categoria() pasando la edad
        String cat = categoria(edad); // Guardamos el resultado en "cat"
 
        // PASO 6: Mostramos el resultado final
        System.out.println(nombre + ", tu categoría es: " + cat);
 
        // PASO 7: Cerramos el Scanner porque ya no se leerán más datos
        sc.close();
    }
}
 