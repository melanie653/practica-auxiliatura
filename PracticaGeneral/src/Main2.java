import java.text.DecimalFormat;
public class Main2 {
    public static void main(String[] args) {
        Bus bus = new Bus("TransAndes", "TA-123", 40);
        bus.subirPasajeros(15);
        System.out.println("Después de subir 15 pasajeros:");
        bus.mostrarInfo();
        bus.subirPasajeros(30);
        System.out.println("\nIntento de subir 30 pasajeros más:");
        bus.mostrarInfo();
        double totalCobrado = bus.cobrarPasaje();
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("\nTotal cobrado (Bs): " + df.format(totalCobrado));
        System.out.println("\nAsientos disponibles: " + bus.asientosDisponibles());
    }
}