package B;

public class Player {

    private int x;
    private int y;
    private Player player;

    public Player(int x, int y) {
        Player player = new Player(x,y);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método que, en función de m, redefine la coordenada xy del Player p
    public void movement(String m, Game game){
        if (m.equalsIgnoreCase("Derecha")){
            setX(getX()+1);
        } else if (m.equalsIgnoreCase("Izquierda")){
            setX(getX()-1);
        } else if (m.equalsIgnoreCase("Arriba")){
            setY(getY()-1);
        } else if (m.equalsIgnoreCase("Abajo")){
            setY(getY()+1);
        }
        game.validarPosicion(player);
    }
}
