package A;

public class Fecha {

    // Atributos de Fecha
    private int dia;
    private int mes;
    private int anio;

    // Constructor de Fecha
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Método que valida si la fecha es correcta
    public boolean fechaValida () {
        return diaValido() && mesValido();
    }

    // Método que verifica que el día es correcto
    public boolean diaValido() {
        return dia >=1 && dia <=diasMes();
    }

    // Método que verifica que el mes es correcto
    public boolean mesValido() {
        return mes >=1 && mes <=12;
    }

    // Método que devuelve el número de días de cada mes
    public int diasMes() {
        switch (mes) {
            case 1,3,5,7,8,10,12: return 31;
            case 4,6,9,11: return 30;
            case 2 : // verificación de año bisiesto
                if (esBisiesto()) return 29;
                else return 28;
            default: return 0;
        }
    }

    // Método que determina si un año es bisiesto
    public boolean esBisiesto() {
        return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
    }
}