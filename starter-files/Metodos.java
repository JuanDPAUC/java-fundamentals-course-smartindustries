public class Metodos // Declaramos la clase principal llamada Metodos
{
    // PASO 1: Definimos un método sin parámetros y sin valor de retorno (void)
    static void saludo() {
        System.out.println("¡Hola, bienvenidos al curso!"); // Imprime un mensaje fijo en pantalla
    }
 
    // PASO 2: Definimos un método void que recibe un parámetro de tipo String
    static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "! ¿Cómo estás?"); // Saluda usando el nombre recibido como parámetro
    }
 
    // PASO 3: Definimos un método void que recibe dos parámetros: String y int
    static void presentar(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años."); // Imprime una presentación combinando ambos parámetros
    }
 
    // PASO 4: Definimos un método que recibe dos enteros y devuelve un valor de tipo int
    static int sumar(int a, int b) {
        return a + b; // Retorna la suma de "a" y "b" al lugar donde se llamó el método
    }
 
    // PASO 5: Definimos un método que recibe un número decimal (double) y devuelve un String
    static String evaluarNota(double nota) {
        if (nota >= 6.0) { // Si la nota es mayor o igual a 6.0...
            return "Aprobado"; // ...se retorna el texto "Aprobado"
        } else { // En caso contrario (nota menor a 6.0)...
            return "Reprobado"; // ...se retorna el texto "Reprobado"
        }
    }
 
    public static void main (String[] args) { // Método main: punto de inicio del programa
 
        // PASO 6: Llamamos al método saludo() dos veces
        saludo(); // Primera llamada: imprime el mensaje de bienvenida
        saludo(); // Segunda llamada: vuelve a imprimir el mismo mensaje
 
        // PASO 7: Llamamos a saludarPersona() enviando "Juan" como argumento
        saludarPersona("Juan");
 
        // PASO 8: Llamamos a presentar() enviando un nombre y una edad como argumentos
        presentar("Juan", 15);
 
        // PASO 9: Llamamos a sumar(5, 4), guardamos el resultado y lo mostramos
        int resultado = sumar(5, 4); // Guardamos el resultado (9) en la variable "resultado"
        System.out.println("La suma es: " + resultado); // Mostramos el valor de "resultado" en pantalla
 
        // PASO 10: Llamamos a sumar(3, 7) directamente dentro del println
        System.out.println("3 + 7 = " + sumar(3, 7)); // Muestra el resultado (10) sin guardarlo en variable
 
        // PASO 11: Llamamos a evaluarNota() con distintos valores y mostramos el resultado
        System.out.println("Carlos: " + evaluarNota(7.5)); // 7.5 >= 6.0, devuelve "Aprobado"
        System.out.println("Ana:    " + evaluarNota(4.8)); // 4.8 < 6.0, devuelve "Reprobado"
    }
}
 