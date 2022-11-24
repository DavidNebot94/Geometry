public class Exercise6 {
    private int x;
    private int y;
    public Exercise6(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise6() {
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
}
// Crea el método toString( ) que devuelve el punto en la forma “(x , y)”

