package tema7.ejemplos;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeNacimiento {

    public static void main(String[] args) {

        // Fecha y hora de nacimiento
        LocalDateTime fechaHoraNacimiento = LocalDateTime.of(1981, 9, 1, 8, 0);

        // Convertir la fecha y hora de nacimiento a un Instant
        Instant nacimientoInstant = fechaHoraNacimiento.atZone(ZoneId.systemDefault()).toInstant();

        // Obtener el Instant actual
        Instant ahoraInstant = Instant.now();

        // Calcular la duración desde el Instant de nacimiento hasta el Instant actual
        Duration duracionDesdeNacimiento = Duration.between(nacimientoInstant, ahoraInstant);

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("En días: " + df.format(duracionDesdeNacimiento.toDays()));
        System.out.println("En horas: " + df.format(duracionDesdeNacimiento.toHours()));
        System.out.println("En minutos: " + df.format(duracionDesdeNacimiento.toMinutes()));
        System.out.println("En segundos: " + df.format(duracionDesdeNacimiento.toSeconds()));
    }
}

/*
Este código realiza las siguientes acciones:

    Define una fecha y hora de nacimiento utilizando la clase LocalDateTime.
    Convierte la fecha y hora de nacimiento a un Instant utilizando el método atZone para ajustarla a la zona horaria del sistema y luego llamando a toInstant.
    Obtiene el Instant actual mediante el método Instant.now().
    Calcula la duración entre el instante de nacimiento y el instante actual utilizando el método Duration.between.
    Formatea la duración en días, horas, minutos y segundos utilizando el método toDays(), toHours(), toMinutes() y toSeconds() respectivamente.
    Imprime la duración formateada en días, horas, minutos y segundos.

En resumen, el código calcula y muestra cuántos días, horas, minutos y segundos han pasado desde el momento de nacimiento hasta el momento actual.
*/