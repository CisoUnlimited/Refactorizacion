package B;

public class Game {



    // Método que verifica la posición de p y la corrige en caso necesario
    protected void validarPosicion(Player player){
        player.setX(Math.max(0, player.getX()));
        player.setY(Math.max(0, player.getY()));
    }
}
