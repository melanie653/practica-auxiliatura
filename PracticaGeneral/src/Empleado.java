class Empleado extends Persona2 {
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, int edad, String cargo, double sueldo) {
        super(nombre, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo: " + sueldo);
    }
}