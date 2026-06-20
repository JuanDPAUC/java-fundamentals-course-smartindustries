/*
 * Lección 6 - Programación Orientada a Objetos
 * Programa: Registro de estudiantes con arreglo de objetos
 *
 * En este archivo encontrarás el mismo programa de la carpeta "scripts",
 * pero explicado paso a paso para que entiendas qué hace cada línea.
 */

// Paso 1: Importamos Scanner para poder leer datos que el usuario escribe
// por teclado (nombre, edad, promedio de cada estudiante).
import java.util.Scanner;

// Paso 2: Creamos la clase Estudiante. Esta clase es el "molde" que define
// qué datos y qué comportamientos tendrá cada estudiante que creemos.
class Estudiante {

    // Paso 3: Los atributos son private. Esto se llama encapsulación:
    // nadie fuera de la clase puede modificar estos datos directamente,
    // solo a través de los métodos que la propia clase ofrece.
    private String nombre;
    private int edad;
    private double promedio;

    // Paso 4: El constructor tiene el mismo nombre que la clase (Estudiante)
    // y se ejecuta automáticamente cada vez que creamos un objeto nuevo con "new".
    // Recibe los datos iniciales y los guarda en los atributos del objeto.
    public Estudiante(String nombre, int edad, double promedio) {
        // "this.nombre" se refiere al atributo de la clase;
        // "nombre" (sin this) se refiere al parámetro que llega al constructor.
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    // Paso 5: Los métodos getXxx() son "getters". Como los atributos son
    // private, estos métodos son la forma correcta de consultar su valor
    // desde fuera de la clase.
    public String getNombre()   { return nombre; }
    public int    getEdad()     { return edad; }
    public double getPromedio() { return promedio; }

    // Paso 6: Este método imprime en consola todos los datos de un estudiante.
    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("Nombre:   " + nombre);
        System.out.println("Edad:     " + edad + " años");
        System.out.println("Promedio: " + promedio);

        // Paso 7: Esto es un operador ternario, una forma corta de escribir
        // un if-else. Se lee así: "si promedio >= 11.0, usa 'Aprobado';
        // si no, usa 'Desaprobado'".
        System.out.println("Estado:   " + (promedio >= 11.0 ? "Aprobado" : "Desaprobado"));
    }
}


// Paso 8: Esta es la clase principal del programa, la que contiene el main().
public class Main {
    public static void main(String[] args) {

        // Paso 9: Creamos un Scanner para leer lo que el usuario escriba por teclado.
        Scanner sc       = new Scanner(System.in);
        int     cantidad = 3;

        // Paso 10: Creamos un arreglo de objetos Estudiante de tamaño 3.
        // Importante: esto SOLO reserva espacio para 3 estudiantes; cada
        // posición del arreglo sigue vacía (null) hasta que la llenemos
        // con un objeto creado mediante "new Estudiante(...)".
        Estudiante[] aula = new Estudiante[cantidad];

        // Paso 11: Este bucle se repite una vez por cada estudiante (3 veces),
        // pidiendo sus datos y guardándolos en el arreglo.
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n=== Estudiante " + (i + 1) + " ===");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Promedio: ");
            double promedio = sc.nextDouble();

            // Paso 12: Después de leer un número con nextInt() o nextDouble(),
            // queda pendiente el salto de línea (Enter) que el usuario presionó.
            // Si no lo "limpiamos" con sc.nextLine(), el próximo nextLine()
            // leería ese salto de línea vacío en lugar del texto esperado.
            sc.nextLine();

            // Paso 13: Creamos un nuevo objeto Estudiante con los datos
            // ingresados y lo guardamos en la posición i del arreglo.
            aula[i] = new Estudiante(nombre, edad, promedio);
        }

        // Paso 14: Una vez registrados todos los estudiantes, recorremos
        // el arreglo con un for-each y mostramos los datos de cada uno.
        System.out.println("\n====== LISTA DE ESTUDIANTES ======");
        for (Estudiante e : aula) {
            e.mostrarDatos();
        }
    }
}