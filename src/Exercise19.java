public class Exercise19 {
    private int x;
    private int y;
    public Exercise19(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise19() {
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
