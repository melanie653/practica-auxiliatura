public class Main7_2 {
    public static void main(String[] args) {
        Sistema sistema = new Sistema("Gestor Vehicular", 5, 5);
        sistema.adicionar("Admin1");
        sistema.adicionar("Auto1", "Toyota", 2022);
        sistema.adicionar("Auto2", "Nissan", 2024);
        sistema.mostrar();
    }
}