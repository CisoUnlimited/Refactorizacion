package C;

public class Window {

    private int x;
    private int y;
    private int width;
    private int height;
    private final int maxArea;

    private Window(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.maxArea = 100;
    }

    private Window setSize(int x, int y, int width, int height) {
        if (!overlaps() && getArea()) {
            return new Window(this.x, this.y, width, height);
        } else return null;
    }

    public boolean overlaps() {
        // Coordenadas de las esquinas de la ventana actual
        int x1 = this.x;
        int y1 = this.y;
        int x2 = this.x + this.width;
        int y2 = this.y + this.height;

        // Coordenadas de las esquinas de la nueva ventana w
        int x3 = x;
        int y3 = y;
        int x4 = x + width;
        int y4 = y + height;

        // Verificar si hay intersección
        return x1 < x4 && x2 > x3 && y1 < y4 && y2 > y3;
    }

    public boolean getArea(){
        return (width * height)<=maxArea;
    }
}
