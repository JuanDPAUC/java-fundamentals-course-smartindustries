import java.util.Scanner; // Importamos la clase Scanner
 
public class BucleBasico { // Clase para practicar bucles
 
    public static void main(String[] args) { // Método main
 
        // PASO 1: Creamos el Scanner para recibir datos
        Scanner sc = new Scanner(System.in);
 
        // PASO 2: Pedimos la cantidad de veces a repetir
        System.out.print("¿Cuántas veces quieres saludar? "); 
        int veces = sc.nextInt(); 
 
        // PASO 3: Usamos un bucle for para repetir la acción
        for (int i = 1; i <= veces; i++) { // Iniciamos en 1 y terminamos en 'veces'
            System.out.println("Saludo número " + i + ": ¡Hola, estudiante!");
        }
 
        // PASO 4: Cerramos el Scanner
        sc.close();
    }
}