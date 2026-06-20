public class TicketRestaurante {
    public static void main(String[] args) {
        
        // 1. Datos de la mesa (Tipos de datos)
        String mesero = "Carlos";
        int personas = 3;
        double subtotal = 45.50;
        boolean propinaIncluida = false;
        
        // 2. Cálculos (Operadores)
        double impuesto = subtotal * 0.10;          // Multiplicación (*) - 10% de impuesto
        double total = subtotal + impuesto;         // Suma (+)
        double pagoPorPersona = total / personas;   // División (/)
        
        // Ejemplo de Módulo (%): Repartir 10 galletas de cortesía equitativamente
        int galletasTotales = 10;
        int galletasSobrantes = galletasTotales % personas; 

        // 3. Resultado en pantalla
        System.out.println("--- TICKET DE COMPRA ---");
        System.out.println("Le atendió: " + mesero);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Cada persona paga: $" + pagoPorPersona);
        System.out.println("¿Propina incluida?: " + propinaIncluida);
        System.out.println("Galletas que sobraron de la cortesía: " + galletasSobrantes);
    }
}
