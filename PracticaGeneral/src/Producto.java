class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = Math.max(0, stock);
    }
    public void vender(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad a vender debe ser mayor que 0.");
        if (cantidad > stock) throw new IllegalArgumentException("Stock insuficiente. Disponible: " + stock);
        stock -= cantidad;
        System.out.println("Se vendieron " + cantidad + " unidades.");
    }
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de reabastecimiento inválida (debe ser > 0).");
            return;
        }
        stock += cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidades.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}
