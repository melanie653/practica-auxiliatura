public class Main1_3 {
    public static void main(String[] args) {
        Persona2 p = new Persona2("Carlos", 28);
        Empleado e = new Empleado("Lucía", 35, "Gerente", 4500);

        p.mostrarDatos();
        System.out.println("------------------");
        e.mostrarDatos();
    }
}