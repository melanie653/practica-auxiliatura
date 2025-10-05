class Bus {
    private String marca;
    private String placa;
    private int capacidad;  
    private int pasajerosActual; 

    public static final double COSTO_PASAJE = 1.50;
    public Bus(String marca, String placa, int capacidad) {
        this.marca = marca;
        this.placa = placa;
        this.capacidad = Math.max(0, capacidad);
        this.pasajerosActual = 0;
    }
    public void subirPasajeros(int cantidad) {
        if (cantidad <= 0) return;
        int espacio = capacidad - pasajerosActual;
        if (cantidad <= espacio) {
            pasajerosActual += cantidad;
        } else {
            pasajerosActual = capacidad;
            System.out.println("Advertencia: no hay suficiente espacio. Se subieron " + espacio + " pasajeros y " + (cantidad - espacio) + " quedaron fuera.");
        }
    }
    public double cobrarPasaje() {
        return pasajerosActual * COSTO_PASAJE;
    }
    public int asientosDisponibles() {
        return capacidad - pasajerosActual;
    }

    public void mostrarInfo() {
        System.out.println("Bus: " + marca + " - Placa: " + placa);
        System.out.println("Capacidad: " + capacidad + ", Pasajeros actuales: " + pasajerosActual);
    }

    public int getPasajerosActual() { return pasajerosActual; }
    public int getCapacidad() { return capacidad; }
}