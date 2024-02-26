package tema5.ejercicios;

public class Pagina {
    private int dia;
    private int mes;
    private Cita[] citas;
    private int numCitas; // Este campo llevará el conteo de citas actuales en el array.

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.citas = new Cita[10]; // Suponiendo un máximo de 10 citas por día.
        this.numCitas = 0;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Cita buscarCita(Cita c) {
        for (int i = 0; i < numCitas; i++) {
            Cita cita = citas[i];
            if (cita.getHora() == c.getHora() && cita.getMinutos() == c.getMinutos()) {
                return cita;
            }
        }
        return null;
    }

    public void agregarCita(Cita c) {
        if (buscarCita(c) != null) {
            System.out.println("ERROR: No se puede agregar la cita, hora ocupada");
        } else if (numCitas < citas.length) {
            citas[numCitas++] = c;
            System.out.println("Cita agregada correctamente el día " + dia + " de " + Agenda.meses[mes - 1] + " a las "
                    + c.getHora() + ":" + c.getMinutos());
        } else {
            System.out.println("ERROR: No se puede agregar más citas, agenda llena");
        }
    }

    public void borrarCita(Cita c) {
        for (int i = 0; i < numCitas; i++) {
            if (citas[i].equals(c)) {
                System.arraycopy(citas, i + 1, citas, i, numCitas - i - 1);
                numCitas--;
                System.out.println("Cita borrada correctamente");
                return;
            }
        }
        System.out.println("ERROR: No se puede borrar la cita, la cita no existe");
    }

    public void verCitas() {
        String s = "ESTAS SON LAS CITAS DEL " + dia + " de " + Agenda.meses[mes - 1] + "\n";
        for (int i = 0; i < numCitas; i++) {
            s += citas[i].toString() + "\n";
        }
        System.out.println(s);
    }
}