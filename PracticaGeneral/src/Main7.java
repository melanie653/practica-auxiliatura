public class Main7 {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 60);
        Mascota m2 = new Mascota("Mishi", "Gato", 85);
        System.out.println("Estado inicial:");
        m1.mostrarEnergia();
        m2.mostrarEnergia();
        System.out.println("\nAlimentando mascotas (+20):");
        m1.alimentar();
        m2.alimentar();
        m1.mostrarEnergia();
        m2.mostrarEnergia();
        System.out.println("\nHaciendo jugar mascotas (-15):");
        m1.jugar();
        m2.jugar();
        m1.mostrarEnergia();
        m2.mostrarEnergia();
        System.out.println("\nJugando repetidamente para ver límite inferior:");
        for (int i = 0; i < 10; i++) {
            m1.jugar();
            m1.mostrarEnergia();
        }
    }
}
