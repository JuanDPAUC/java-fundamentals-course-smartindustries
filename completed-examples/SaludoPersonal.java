import java.util.Scanner;
 
public class SaludoPersonal {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
 
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso de Java.");
 
        sc.close();
    }
}
