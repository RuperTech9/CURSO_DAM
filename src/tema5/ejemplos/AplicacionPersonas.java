

package tema5.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ruper
 */
class AplicacionPersonas {
    String nombre;
    int edad;

    public AplicacionPersonas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " años";
    }



    public static void main(String[] args) {
        List<AplicacionPersonas> personas = new ArrayList<>();
        personas.add(new AplicacionPersonas("Juan", 30));
        personas.add(new AplicacionPersonas("María", 25));
        personas.add(new AplicacionPersonas("Pedro", 35));

        // Ordenar la lista de personas por edad usando Comparator
        Collections.sort(personas, new Comparator<AplicacionPersonas>() { //Collections.sort() para ordenar la lista de personas según su edad. Comparator<AplicacionPersonas> define cómo comparar dos objetos Persona basándose en su edad.
            @Override
            public int compare(AplicacionPersonas p1, AplicacionPersonas p2) {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        });

        // Imprimir la lista ordenada
        System.out.println("Personas ordenadas por edad:");
        for (AplicacionPersonas persona : personas) {
            System.out.println(persona);
        }
    }
}