package tema4.ejemplos;
public class MatricesIrregulares {

    public static void main(String[] args) {

        int[][] matriz = new int[5][];     
        int contador = 0;   

        // recorrido de la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            matriz[fila] = new int[fila+1];
            for (int columna = 0; matriz[fila] != null && columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = ++contador%10 == 0 ? ++contador%10 : contador%10;
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}


/*
Este código Java crea y manipula una matriz irregular, también conocida como una matriz "jagged", donde cada fila de la matriz puede tener un número diferente de columnas. A continuación, te explico el código paso a paso:

int[][] b = new int[10][];:

Se declara una matriz de dos dimensiones llamada b.
Se inicializa con 10 filas, pero no se especifica el tamaño de las columnas para cada fila, lo que permite que cada fila tenga un tamaño diferente.
int contador = 0;:

Se declara una variable contador y se inicializa en 0. Se usará para asignar valores a los elementos de la matriz.
El primer bucle for itera sobre cada fila de la matriz b:

for (int fila = 0; fila < b.length; fila++) { inicia un bucle que recorre desde la primera fila (fila = 0) hasta la última (fila < b.length, donde b.length es 10).
Dentro del primer bucle for:

b[fila] = new int[fila+1];:
Cada fila de la matriz b se inicializa con un nuevo arreglo de enteros.
El tamaño de cada fila es igual al índice de la fila (fila) más uno. Esto significa que la primera fila tendrá 1 columna, la segunda fila tendrá 2 columnas, y así sucesivamente, creando una estructura triangular o piramidal.
El segundo bucle for anidado itera sobre las columnas de la fila actual:

for (int columna = 0; b[fila] != null && columna < b[fila].length; columna++) {:
Verifica que la fila actual no sea nula y que el índice de la columna esté dentro de los límites de la fila actual (columna < b[fila].length).
Dentro del segundo bucle for:

b[fila][columna] = ++contador%10 == 0 ? ++contador%10 : contador%10;:
Incrementa contador antes de usarlo (++contador).
Calcula el módulo de contador por 10 (contador%10), que da el residuo de dividir contador entre 10.
Utiliza el operador ternario (? :) para evaluar si el residuo es 0. Si lo es, incrementa contador nuevamente y calcula el módulo por 10. Si no, simplemente usa el residuo calculado.
El propósito de este cálculo es evitar que se asigne el valor 0 a cualquier elemento de la matriz, reemplazándolo por el siguiente número.
Asigna este valor al elemento actual de la matriz en la posición [fila][columna].
System.out.print(b[fila][columna] + " ");:

Imprime el valor del elemento actual de la matriz seguido de un espacio, sin un salto de línea al final.
System.out.println();:

Al final de cada fila, se imprime un salto de línea para que la salida de la siguiente fila comience en una nueva línea.
El resultado de ejecutar este código será una matriz impresa en forma de triángulo, donde la primera fila tiene 1 elemento, la segunda tiene 2, y así sucesivamente, hasta la décima fila con 10 elementos. Los valores serán del 1 al 9 repetidos secuencialmente, debido al uso del operador módulo en el cálculo de los valores.
*/