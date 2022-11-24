public class Exercise14 {
    private int x;
    private int y;
    public Exercise14(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise14() {
        this(0, 0);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setOffset(int offsetX, int offsetY) {
        x += offsetX;
        y += offsetY;
    }
} public class Main2 {
    public static void main(String[] argv) {
        Exercise14 p1 = new Exercise14(4, 5);
        Exercise14 p2 = new Exercise14(6, 8);
        p1.setOffset(4, 4);
        p2.setOffset(4, 4);
    }
}

//moverlos 4 unidades a la derecha y 4 unidades hacia arriba (desplazamiento x = 4, desplazamiento y = 4)