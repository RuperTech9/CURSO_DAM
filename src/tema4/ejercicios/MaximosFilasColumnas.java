package tema4.ejercicios;


public class MaximosFilasColumnas {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        mostrarMatrizTranspuesta(matriz);
        
        int[] maximosCol = maximosColumnas(matriz);
        System.out.println("\nMáximos por fila:");
        for (int max : maximosCol) {
            System.out.print(max + " ");
        }

        int[] maximosFil = maximosFilas(matriz);
        System.out.println("\n\nMáximos por columna:");
        for (int max : maximosFil) {
            System.out.print(max + " ");
        }
    }

    public static void mostrarMatrizTranspuesta(int[][] matriz) {

        for (int i = 0; i < matriz.length - 1; i++) {
            if (matriz[i].length != matriz[i + 1].length) {
                System.out.println("\nERROR: No se puede obtener la transpuesta, la matriz no es válida");
                return;
            }
        }

        System.out.println("\nMatriz transpuesta:");
        int[][] transpuesta = new int[matriz.length == 0 ? 0 : matriz[0].length][matriz.length];
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        for (int[] fila : transpuesta) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static int[] maximosColumnas(int[][] matriz) {

        int anchoMax = 0;
        for (int[] fila : matriz) {
            if (fila.length > anchoMax)
                anchoMax = fila.length;
        }
        int[] arrayMaximos = new int[anchoMax];
        for (int i = 0; i < arrayMaximos.length; i++) {
            arrayMaximos[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > arrayMaximos[j])
                    arrayMaximos[j] = matriz[i][j];
            }
        }
        return arrayMaximos;
    }

    public static int[] maximosFilas(int[][] matriz) {

        int maxFila;
        int[] arrayMaximos = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            maxFila = Integer.MIN_VALUE;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxFila)
                    maxFila = matriz[i][j];
            }
            arrayMaximos[i] = maxFila;
        }
        return arrayMaximos;
    }

}
