class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = Math.max(0, edad);
        this.ci = ci;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido paterno: " + paterno);
        System.out.println("Apellido materno: " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
    }
    public boolean mayorDeEdad() {
        return edad >= 18;
    }
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad < 0) {
            System.out.println("Edad inválida.");
            return;
        }
        this.edad = nuevaEdad;
    }
    public boolean tieneMismoApellidoPaterno(Persona otra) {
        if (otra == null) return false;
        return this.paterno.equalsIgnoreCase(otra.paterno);
    }
    public String getNombre() { return nombre; }
}