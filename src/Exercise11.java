public class Exercise11 {
    private int x;
    private int y;
    public Exercise11(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise11() {
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
}
public class Main {
    public static void main(String[] argv) {
        Exercise11 p = new Exercise11(3, 4);
        p.moveTo(8, 9);
        System.out.println(p);
    }
}

//Crea los métodos setX() y setY()