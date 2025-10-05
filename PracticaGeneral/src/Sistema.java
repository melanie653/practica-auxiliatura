class Sistema {
    private String nombre;
    private String[] admins;
    private Auto[] autos;
    private int nroAdmins;
    private int nroAutos;

    public Sistema() {
        this("Sistema", 5, 5);
    }

    public Sistema(String nombre, int maxAdmins, int maxAutos) {
        this.nombre = nombre;
        admins = new String[maxAdmins];
        autos = new Auto[maxAutos];
        nroAdmins = 0;
        nroAutos = 0;
    }

    public void mostrar() {
        System.out.println("Sistema: " + nombre);
        System.out.println("Admins:");
        for (int i=0; i<nroAdmins; i++) System.out.println(" - " + admins[i]);
        System.out.println("Autos:");
        for (int i=0; i<nroAutos; i++) autos[i].mostrar();
    }

    public void adicionar(String admin) {
        if (nroAdmins < admins.length) admins[nroAdmins++] = admin;
    }

    public void adicionar(String nombre, String marca, int año) {
        if (nroAutos < autos.length) autos[nroAutos++] = new Auto(nombre, marca, año);
    }
}