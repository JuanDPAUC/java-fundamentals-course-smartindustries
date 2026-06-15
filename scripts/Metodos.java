public class Metodos // Declaramos la clase principal llamada Metodos
{
    static void saludo() { // Método sin parámetros y sin valor de retorno (void)
        System.out.println("¡Hola, bienvenidos al curso!"); // Imprime un mensaje fijo en pantalla
    }

    static void saludarPersona(String nombre) { // Método void que recibe un parámetro de tipo String (nombre)
        System.out.println("¡Hola, " + nombre + "! ¿Cómo estás?"); // Saluda usando el nombre recibido como parámetro
    }

    static void presentar(String nombre, int edad) { // Método void que recibe dos parámetros: un String y un int
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años."); // Imprime una presentación combinando ambos parámetros
    }

    static int sumar(int a, int b) { // Método que recibe dos enteros y devuelve un valor de tipo int
        return a + b; // Retorna la suma de "a" y "b" al lugar donde se llamó el método
    }

    static String evaluarNota(double nota) { // Método que recibe un número decimal (double) y devuelve un String
        if (nota >= 6.0) { // Si la nota es mayor o igual a 6.0...
            return "Aprobado"; // ...se retorna el texto "Aprobado"
        } else { // En caso contrario (nota menor a 6.0)...
            return "Reprobado"; // ...se retorna el texto "Reprobado"
        }
    }

    public static void main (String[] args) { // Método main: punto de inicio del programa
        saludo(); // Llamamos al método saludo() por primera vez
        saludo(); // Llamamos al método saludo() por segunda vez

        saludarPersona("Juan"); // Llamamos a saludarPersona() enviando "Juan" como argumento

        presentar("Juan", 15); // Llamamos a presentar() enviando un nombre y una edad como argumentos

        int resultado = sumar(5, 4); // Llamamos a sumar(5, 4) y guardamos el resultado (9) en la variable "resultado"
        System.out.println("La suma es: " + resultado); // Mostramos el valor de "resultado" en pantalla

        System.out.println("3 + 7 = " + sumar(3, 7)); // Llamamos a sumar(3, 7) directamente dentro del println y mostramos el resultado (10)

        System.out.println("Carlos: " + evaluarNota(7.5)); // Llamamos a evaluarNota(7.5); como 7.5 >= 6.0, devuelve "Aprobado"
        System.out.println("Ana:    " + evaluarNota(4.8)); // Llamamos a evaluarNota(4.8); como 4.8 < 6.0, devuelve "Reprobado"
    }
}
