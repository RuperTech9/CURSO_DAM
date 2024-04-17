package tema7.ejemplos.programacionFuncional;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TrabajadoresListaDeStringsAObjetos {

    public static void main(String[] args) {
      List<String> nombres = Arrays.asList("Tom", "Jon", "Kal", "Ana");

      Comparator<Trabajador> comparadorTrabajadores = Comparator.comparing(Trabajador::getNombre);

      // Method Reference para referenciar al constructor de la clase Trabajador
      Function<String, Trabajador> referenciaConstructor = Trabajador::new;
      List<Trabajador> trabajadores = nombres.stream()      
                                      .map(referenciaConstructor)  
                                      .sorted(comparadorTrabajadores)                                    
                                      .collect(Collectors.toList());
      
      System.out.println("Lista de trabajadores: " + trabajadores); 
      }
}

/*
Este código muestra cómo utilizar streams en Java para transformar una lista de nombres en una lista de objetos de tipo Trabajador ordenados por nombre.

Se define una lista de nombres usando Arrays.asList.
Se crea un comparador para ordenar los trabajadores por nombre utilizando Comparator.comparing.
Se define una función (Function) que toma un nombre de trabajador y devuelve un objeto Trabajador. Esta función se utiliza como referencia al constructor de la clase Trabajador usando un Method Reference.
Se utiliza el método map para convertir cada nombre en un objeto Trabajador utilizando la función de referencia al constructor.
Se utiliza el método sorted para ordenar los trabajadores utilizando el comparador definido anteriormente.
Se recopilan los trabajadores en una lista utilizando Collectors.toList.
Se imprime la lista de trabajadores ordenados por nombre.
*/