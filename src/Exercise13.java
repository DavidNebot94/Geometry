public class Exercise13 {
    private int x;
    private int y;
    public Exercise13(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise13() {
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
}
public class Main2 {
    public static void main(String[] argv) {
        Exercise13 p1 = new Exercise13(4, 5);
        Exercise13 p2 = new Exercise13(6, 8);
    }
}
//Cree Main2 e instancia dos puntos (4,5) y (6,8).