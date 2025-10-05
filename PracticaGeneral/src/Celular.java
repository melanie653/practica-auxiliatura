class Celular {
    private String nroTel;
    private String dueño;
    private int espacio;
    private int ram;     
    private int nroApp;

    public Celular(String nroTel, String dueño, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    public void incrementar() {
        nroApp += 10;
    }

    public void decrementar() {
        espacio -= 5;
        if (espacio < 0) espacio = 0;
    }

    public void mostrar() {
        System.out.println("Celular de " + dueño + " | Tel: " + nroTel +
                " | Espacio: " + espacio + "GB | RAM: " + ram + "GB | Apps: " + nroApp);
    }
}