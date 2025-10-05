import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args) {
        Videojuego v1 = new Videojuego(); // por defecto
        Videojuego v2 = new Videojuego("FIFA 25");
        Videojuego v3 = new Videojuego("Minecraft", "PC", 10);
        v1.mostrar();
        v2.mostrar();
        v3.mostrar();
        System.out.println("\nAgregando jugadores:");
        v2.agregarJugadores(); 
        v2.agregarJugadores(5); 
        v2.mostrar();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese cantidad de jugadores para FIFA: ");
        int cant = sc.nextInt();
        v1.agregarJugadores(cant);
        v1.mostrar();
        sc.close();
    }
}