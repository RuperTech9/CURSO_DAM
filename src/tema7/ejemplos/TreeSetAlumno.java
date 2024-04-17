package tema7.ejemplos;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAlumno {

    public static void main(String[] args) {

        Set<String> nombres = new TreeSet<>();
        nombres.add("Pep");
        nombres.add("Tom");
        nombres.add("Sam");
        nombres.add("Ben");
        System.out.println(nombres);

        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(9);
        nums.add(2);
        nums.add(8);
        nums.add(7);
        nums.add(5);
        System.out.println(nums); // Imprime el conjunto de números actualmente almacenados en el TreeSet: [1, 2, 3, 5]
        System.out.println(nums.ceiling(4)); // Encuentra y devuelve el número más pequeño en el conjunto que es igual o mayor que 4.
        System.out.println(nums.ceiling(5)); // Encuentra y devuelve el número más pequeño en el conjunto que es igual o mayor que 5.
        System.out.println(nums.floor(4)); // Encuentra y devuelve el número más grande en el conjunto que es igual o menor que 4.
        System.out.println(nums.floor(5)); // Encuentra y devuelve el número más grande en el conjunto que es igual o menor que 5.
        System.out.println(nums.lower(8)); // Devuelve el número más grande en el conjunto que es estrictamente menor que 8.
        System.out.println(nums.higher(2)); // Devuelve el número más pequeño en el conjunto que es estrictamente mayor que 2.
        System.out.println(nums.pollFirst()); // Devuelve y elimina el primer elemento (el más pequeño) del conjunto.
        System.out.println(nums.pollLast()); // Devuelve y elimina el último elemento (el más grande) del conjunto.
        System.out.println(nums); // Imprime el conjunto actualizado después de las operaciones de eliminación.

        TreeSet<Alumno> dam = new TreeSet<>(new AlumnoPorEdadComparator());
        Alumno a1 = new Alumno("Pep", "222A", 25);
        Alumno a2 = new Alumno("Sam", "555A", 18);
        Alumno a3 = new Alumno("Pol", "666A", 18);
        Alumno a4 = new Alumno("Kal", "666A", 20);
        Alumno a5 = new Alumno("Tim", "777A", 20);
        Alumno a6 = new Alumno("Pep", "222A", 28);

        dam.add(a1);
        System.out.println(dam);
        dam.add(a2);
        System.out.println(dam);
        dam.add(a3);
        System.out.println(dam);
        dam.add(a4);        
        System.out.println(dam);
        dam.add(a5);
        System.out.println(dam);
        dam.add(a6);
        System.out.println(dam);
    }

}

/*
Este código muestra el uso de la clase TreeSet en Java, que implementa la interfaz Set y almacena elementos ordenados según su valor natural o mediante un comparador personalizado.

Aquí está lo que hace cada parte del código:

Se crea un TreeSet llamado nombres que almacena cadenas (String). Se agregan varios nombres al conjunto y luego se imprime el conjunto. Debido a que TreeSet ordena automáticamente los elementos en orden ascendente, los nombres se mostrarán en orden alfabético.

Se crea un TreeSet llamado nums que almacena enteros (Integer). Se agregan varios números al conjunto y luego se imprimen. Debido a que TreeSet ordena automáticamente los elementos en orden ascendente, los números se mostrarán en orden creciente y los duplicados se eliminarán automáticamente. Además, se demuestra el uso de varios métodos como ceiling, floor, lower, higher, pollFirst y pollLast, que son métodos proporcionados por TreeSet para realizar operaciones relacionadas con elementos y navegación en el conjunto.

Se crea un TreeSet llamado dam que almacena objetos de la clase Alumno. Se utiliza un comparador personalizado (AlumnoPorEdadComparator) para ordenar los objetos Alumno en el conjunto por edad. Se agregan varios objetos Alumno al conjunto y se imprime después de cada adición para observar cómo se ordenan los elementos en el conjunto.

En resumen, el código ilustra cómo utilizar la clase TreeSet para almacenar elementos únicos ordenados y cómo usar un comparador personalizado para definir el orden de los elementos almacenados.
*/