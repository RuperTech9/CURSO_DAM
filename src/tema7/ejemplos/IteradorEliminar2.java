package tema7.ejemplos;
import java.util.ArrayList;
import java.util.Iterator;

public class IteradorEliminar2 {

    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Pepe García");
        clientes.add("Toni Pérez");
        clientes.add("Marta Gómez");
        clientes.add("Sara Martínez");
        clientes.add("Tom Martínez");

        Iterator<String> clienteIterator = clientes.iterator();
        while (clienteIterator.hasNext()) {
            String cliente = clienteIterator.next();
            if (cliente.charAt(0) == 'T')
                clienteIterator.remove();
            System.out.println(cliente);
        }
        System.out.println(clientes);
    }

}
