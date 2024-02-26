package tema4.ejemplos;


import tema4.bordes.Bordes;
import tema4.generadores.GeneredorMatrices;
import tema4.ejercicios.MaximosFilasColumnas;

public class Matrices {

    public static void main(String[] args) {

        // declaración y inicialización
        int[][] matriz = new int[5][5];

        // recorrido de la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = (fila + columna) % 10;
            }
        }

        Bordes.mostrarTextoConBordes("matriz cuadrada");
        Bordes.mostrarMatrizConBordes(matriz);

        int[][] matrizA = GeneredorMatrices.generarMatriz(7, 5, 1000);
        int[][] matrizB = GeneredorMatrices.generarMatriz(6, 7, 1000);

        Bordes.mostrarMatricesConBordes(5, matriz, matrizA, matrizB);

        MaximosFilasColumnas.mostrarMatrizTranspuesta(matrizA);
        MaximosFilasColumnas.mostrarMatrizTranspuesta(matrizB);
    }

}
