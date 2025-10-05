public class Main3_2 {
    public static void main(String[] args) {
        float[][] datos = {{1,2},{3,4}};
        Matriz m1 = new Matriz(); // identidad
        Matriz m2 = new Matriz(datos);

        System.out.println("Matriz 1:");
        m1.mostrar();
        System.out.println("\nMatriz 2:");
        m2.mostrar();

        Matriz suma = m1.sumar(m2);
        System.out.println("\nSuma:");
        suma.mostrar();

        Matriz resta = m2.restar(m1);
        System.out.println("\nResta:");
        resta.mostrar();

        System.out.println("\n¿M1 = M2? " + m1.igual(m2));
    }
}