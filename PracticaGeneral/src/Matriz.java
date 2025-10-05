
import java.util.Arrays;

class Matriz {
    private float[][] matriz;

    public Matriz() {
        matriz = new float[2][2];
        for (int i=0; i<2; i++) matriz[i][i] = 1;
    }

    public Matriz(float[][] datos) {
        matriz = new float[datos.length][datos[0].length];
        for (int i=0; i<datos.length; i++)
            matriz[i] = Arrays.copyOf(datos[i], datos[i].length);
    }

    public Matriz sumar(Matriz otra) {
        int n = matriz.length, m = matriz[0].length;
        float[][] res = new float[n][m];
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++)
                res[i][j] = matriz[i][j] + otra.matriz[i][j];
        return new Matriz(res);
    }

    public Matriz restar(Matriz otra) {
        int n = matriz.length, m = matriz[0].length;
        float[][] res = new float[n][m];
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++)
                res[i][j] = matriz[i][j] - otra.matriz[i][j];
        return new Matriz(res);
    }

    public boolean igual(Matriz otra) {
        for (int i=0; i<matriz.length; i++)
            for (int j=0; j<matriz[i].length; j++)
                if (matriz[i][j] != otra.matriz[i][j]) return false;
        return true;
    }

    public void mostrar() {
        for (float[] fila : matriz) {
            for (float v : fila) System.out.print(v + " ");
            System.out.println();
        }
    }
}
