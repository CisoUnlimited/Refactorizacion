package D;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Persona {

    protected String numeroDeTelefono;

    protected Persona(String numeroDeTelefono){
        this.numeroDeTelefono = setNumeroDeTelefono(numeroDeTelefono);
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
}
