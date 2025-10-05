public class Main3 {
    public static void main(String[] args) {
        Producto p = new Producto("Jugo Natural", 12.5, 10);
        System.out.println("Producto inicial:");
        p.mostrarInfo();
        System.out.println("\nVender 3 unidades:");
        try {
            p.vender(3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        p.mostrarInfo();
        System.out.println("\nIntentar vender 20 unidades:");
        try {
            p.vender(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        p.mostrarInfo();
        System.out.println("\nReabastecer 15 unidades:");
        p.reabastecer(15);
        p.mostrarInfo();
    }
}