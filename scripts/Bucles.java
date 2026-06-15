import java.util.Scanner; // Importamos Scanner para la entrada de datos

public class BucleUsuario { 

    static void cuentaRegresiva(int inicio) { // Método que realiza una cuenta regresiva
        while (inicio >= 0) { // Mientras el número sea mayor o igual a 0...
            System.out.println("Tiempo restante: " + inicio); // ...imprimimos el tiempo
            inicio--; // Decrementamos el contador
        }
        System.out.println("¡Despegue!");
    }

    public static void main(String[] args) { // Método principal

        Scanner sc = new Scanner(System.in); // Objeto para leer del teclado

        System.out.print("Introduce un número para la cuenta regresiva: "); // Solicitamos el número
        int numero = sc.nextInt(); // Leemos el entero

        cuentaRegresiva(numero); // Llamamos al método con el número ingresado

        sc.close(); // Cerramos el scanner
    }
}