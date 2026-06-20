public class TicketRestaurante {
    public static void main(String[] args) {
        
        String mesero = "Carlos";
        int personas = 3;
        double subtotal = 45.50;
        boolean propinaIncluida = false;
        
        
        double impuesto = subtotal * 0.10;          
        double total = subtotal + impuesto;        
        double pagoPorPersona = total / personas;   
        
    
        int galletasTotales = 10;
        int galletasSobrantes = galletasTotales % personas; 

        
        System.out.println("--- TICKET DE COMPRA ---");
        System.out.println("Le atendió: " + mesero);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Cada persona paga: $" + pagoPorPersona);
        System.out.println("¿Propina incluida?: " + propinaIncluida);
        System.out.println("Galletas que sobraron de la cortesía: " + galletasSobrantes);
    }
}
