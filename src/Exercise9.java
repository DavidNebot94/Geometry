public class Exercise9 {
    private int x;
    private int y;
    public Exercise9(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise9() {
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
public class Main {
    public static void main(String[] argv) {
        Exercise9 p = new Exercise9(3, 4);
        p.moveTo(8, 9);
        System.out.println(p);
    }
}

//Asegúrese de que su clase encapsule sus datos.
//Esto significa comprobar que nuestros campos son privados. Están.