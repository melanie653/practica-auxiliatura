class Auto {
    private String nombre;
    private String marca;
    private int año;

    public Auto(String nombre, String marca, int año) {
        this.nombre = nombre;
        this.marca = marca;
        this.año = año;
    }

    public void mostrar() {
        System.out.println("Auto: " + nombre + " | Marca: " + marca + " | Año: " + año);
    }
}
