public class Exercise12 {
    private int x;
    private int y;
    public Exercise12(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise12() {
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
//Cree el método setOffset(int offX, int offY) que incrementa los valores de x e y.