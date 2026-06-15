public class Metodos
{
    static void saludo() {
        System.out.println("¡Hola, bienvenidos al curso!");
    }
    
    static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "! ¿Cómo estás?");
    }
    
    static void presentar(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }

    static int sumar(int a, int b) {
        return a + b;
    }
    static String evaluarNota(double nota) {
        if (nota >= 6.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public static void main (String[] args) {
        saludo();
        saludo();
        saludarPersona("Juan");
        presentar("Juan", 15);
        
        int resultado = sumar(5, 4);
        System.out.println("La suma es: " + resultado);
        System.out.println("3 + 7 = " + sumar(3, 7));
        
        System.out.println("Carlos: " + evaluarNota(7.5));
        System.out.println("Ana:    " + evaluarNota(4.8));
    } 
}