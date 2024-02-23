package B;

public class Game {
    Player p;
    // M�todo que, en funci�n de m, redefine la coordenada xy del Player p
    public void movement(String m){
        if (m.equalsIgnoreCase("Derecha")){
            p.setX(p.getX()+1);
        } else if (m.equalsIgnoreCase("Izquierda")){
            p.setX(p.getX()-1);
        } else if (m.equalsIgnoreCase("Arriba")){
            p.setY(p.getY()-1);
        } else if (m.equalsIgnoreCase("Abajo")){
            p.setY(p.getY()+1);
        }
        validarPosicion();
    }

    // M�todo que verifica la posici�n de p y la corrige en caso necesario
    private void validarPosicion(){
        p.setX(Math.max(0, p.getX()));
        p.setY(Math.max(0, p.getY()));
    }
}
