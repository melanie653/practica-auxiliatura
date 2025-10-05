class Mascota {
    private String nombre;
    private String especie;
    private int energia; 

    public Mascota(String nombre, String especie, int energia) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = Math.max(0, Math.min(100, energia));
    }
    public void alimentar() {
        energia = Math.min(100, energia + 20);
        System.out.println(nombre + " se alimentó. Energía ahora: " + energia);
    }
    public void jugar() {
        energia = Math.max(0, energia - 15);
        System.out.println(nombre + " jugó. Energía ahora: " + energia);
    }

    public void mostrarEnergia() {
        System.out.println(nombre + " (" + especie + ") - Energía: " + energia);
    }
}