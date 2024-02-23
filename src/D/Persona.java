package D;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Persona {

    protected String numeroDeTelefono;
    protected String nombre;
    protected int edad;

    protected Persona(String numeroDeTelefono, String nombre, int edad){
        this.numeroDeTelefono = setNumeroDeTelefono(numeroDeTelefono);
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public String setNumeroDeTelefono(String numeroDeTelefono) {
        if (checkTlf()) {
            return numeroDeTelefono;
        } else return null;
    }

    public boolean checkTlf(){
        try {
            String comprobador = "[0-9]{9}";
            Pattern pattern = Pattern.compile(comprobador);
            Matcher unir = pattern.matcher(numeroDeTelefono);
            return unir.matches();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + numeroDeTelefono);
    }
}
