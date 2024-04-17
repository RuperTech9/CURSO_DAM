package tema7.ejemplos.programacionFuncional;
import java.util.List;

public class EjemplosListStreams {

    public static void main(String[] args) {

        List<Integer> lista1 = List.of(2, 1,  4,  6, 8, 10);
        List<Integer> lista2 = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> lista3 = List.of(21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
        List<Integer> lista4 = List.of(31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
        List<List<Integer>> listaFinal = List.of(lista1, lista2, lista3, lista4);

        // EJEMPLO 1: Filtra los elementos de las listas listaFinal que son múltiplos de 10, los imprime y luego los divide por 10. Finalmente, los agrega a una nueva lista llamada listaFiltrada. Imprime la lista resultante.
        List<Integer> listaFiltrada = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n % 10 == 0)
                .map(n -> n / 10)
                .toList();

        System.out.println(listaFiltrada); // [1, 2, 3, 4]

        // EJEMPLO 2: Cuenta la cantidad de elementos en las listas listaFinal que son múltiplos de 10 y los divide por 10.
        long cantidad = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n % 10 == 0)
                .count();

        System.out.println(cantidad); // 4

        // EJEMPLO 3: Calcula la suma de los elementos en las listas listaFinal que son múltiplos de 10, los divide por 10, y luego multiplica cada resultado por 2.
        int total = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n % 10 == 0)
                .map(n -> n / 10 * 2)
                .reduce(0, Integer::sum);

        System.out.println(total); // 20

        // EJEMPLO 4: Toma elementos de las listas listaFinal hasta que se encuentre uno que sea mayor o igual a 20.
        List<Integer> menores = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n < 20)
                .toList();

        System.out.println(menores); // [2, 1, 4, 6, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

        // EJEMPLO 5: Descarta elementos de las listas listaFinal hasta que se encuentre uno que sea mayor o igual a 20.
        List<Integer> mayores = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n >= 20)
                .toList();

        System.out.println(mayores); // [20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]

        // EJEMPLO 6: Toma elementos de las listas listaFinal mientras sean impares.
        List<Integer> ninguno = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println(ninguno); // [1, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39]

        // EJEMPLO 7: Descarta elementos de las listas listaFinal mientras sean pares. Retorna todos los elementos que no fueron descartados, que en este caso son todos los números del 1 al 40.
        List<Integer> todos = listaFinal.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(todos); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]
    }
}
