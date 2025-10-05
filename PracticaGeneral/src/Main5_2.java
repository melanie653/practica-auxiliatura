public class Main5_2 {
    public static void main(String[] args) {
        Celular c = new Celular("78912345", "Andrei", 64, 8, 15);
        System.out.println("Datos iniciales:");
        c.mostrar();

        System.out.println("\nAplicando ++ (incrementa apps):");
        c.incrementar();
        c.mostrar();

        System.out.println("\nAplicando -- (reduce espacio):");
        c.decrementar();
        c.mostrar();
    }
}