public class Exercise15 {
    private int x;
    private int y;
    public Exercise15(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise15() {
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
        Exercise15 p1 = new Exercise15(4, 5);
        Exercise15 p2 = new Exercise15(6, 8);
        p1.setOffset(4, 4);
        p2.setOffset(4, 4);
        System.out.println("P1 = " + p1.toString());
        System.out.println("P2 = " + p1.toString());
    }
}
// Imprimelas