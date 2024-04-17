package tema7.ejemplos.programacionFuncional;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import tema4.generadores.*;

public class GeneradorArrayAleatorios {

    public static void main(String[] args) {

        // Creamos un array con enteros aleatorios
        int[] arrayDesordenado = GeneradorArrays.generarArray(100_000_0);

        // Convertimos el array en una lista
        List<Integer> listaDesordenada = Arrays.stream(arrayDesordenado)
                .boxed()
                .toList();

        // Ordenamos la lista y medimos el tiempo
        Instant inicio = Instant.now();
        List<Integer> listaOrdenada = listaDesordenada.stream().sorted().collect(Collectors.toList());
        // listaDesordenada.stream().sorted().toArray();
        Instant fin = Instant.now();

        // Mostramos la duración en milisegundos
        System.out.println("Duración en milisegundos: " + Duration.between(inicio, fin).toMillis());

        // Mostramos la lista ordenada
        System.out.println("Lista ordenada: " + listaOrdenada);
    }
}

/*

Esta clase realiza las siguientes acciones:

Genera un array de enteros aleatorios utilizando el método GeneradorArrays.generarArray().
Convierte el array de enteros en una lista utilizando streams de Java.
Ordena la lista de enteros de forma ascendente utilizando el método sorted() de los streams.
Mide el tiempo que tarda en ordenar la lista utilizando la clase Instant para marcar el inicio y el fin del proceso.
Imprime la duración del proceso en milisegundos.
*/