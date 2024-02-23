package D;

import java.util.List;

public class Profesor extends Persona{
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String nombre, int edad) {
        super(numeroDeTelefono, nombre, edad);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}
