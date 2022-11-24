public class Exercise22 {
    private int x;
    private int y;
    public Exercise22(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise22() {
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
}
class main {
    public static void main(String[] argv) {
        Exercise9 p1 = new Exercise9(4, 5);
        Exercise9 p2 = new Exercise9(6, 8);
        p1.moveTo(4, 4);
        System.out.println(p1);
    }
}
