public class Main5 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", "Gonzales", "Lopez", 20, "1234567");
        Persona p2 = new Persona("Luis", "Gonzales", "Perez", 17, "7654321");
        System.out.println("Persona 1:");
        p1.mostrarDatos();
        System.out.println("\nPersona 2:");
        p2.mostrarDatos();
        System.out.println("\n¿Persona 1 es mayor de edad? " + p1.mayorDeEdad());
        System.out.println("¿Persona 2 es mayor de edad? " + p2.mayorDeEdad());
        System.out.println("\nModificar edad de Persona 2 a 18:");
        p2.modificarEdad(18);
        p2.mostrarDatos();
        System.out.println("¿Persona 2 es mayor de edad? " + p2.mayorDeEdad());
        System.out.println("\n¿Tienen el mismo apellido paterno? " + p1.tieneMismoApellidoPaterno(p2));
    }
}