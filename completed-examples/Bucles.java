public class MetodosBucles
{
    // Método que usa un bucle for para imprimir un mensaje varias veces
    static void repetirMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }
    
    // Método que usa un bucle while para contar hasta un número
    static void contarHasta(int limite) {
        int i = 1;
        while (i <= limite) {
            System.out.println("Número: " + i);
            i++;
        }
    }

    // Método que evalúa números pares e impares
    static void clasificarNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }

    public static void main (String[] args) {
        System.out.println("--- Repetición ---");
        repetirMensaje("¡Hola!", 3);
        
        System.out.println("\n--- Conteo ---");
        contarHasta(5);
        
        System.out.println("\n--- Clasificación ---");
        clasificarNumeros(4);
    } 
}