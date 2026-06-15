import java.util.Scanner;

public class CategorizarEdad {
 
    static String categoria(int edad) {
        if (edad < 12) {
            return "Niño/a";
        } else if (edad < 18) {
            return "Adolescente";
        } else {
            return "Adulto/a";
        }
    }
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.nextLine();
 
        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();
        sc.nextLine();
 
        String cat = categoria(edad);
 
        System.out.println(nombre + ", tu categoría es: " + cat);
 
        sc.close();
    }
}
