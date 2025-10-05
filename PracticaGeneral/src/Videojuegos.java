class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "N/A";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se agregó 1 jugador al videojuego " + nombre);
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores al videojuego " + nombre);
    }

    public void mostrar() {
        System.out.println("Videojuego: " + nombre + " | Plataforma: " + plataforma + " | Jugadores: " + cantidadJugadores);
    }
}