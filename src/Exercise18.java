public class Exercise18 {
    private int x;
    private int y;
    public Exercise18(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise18() {
        this(0, 0);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public double calcular(Exercise18 p) {
        int x1=x;
        int y1=y;
        int x2=p.getX();
        int y2=p.getX();
        double calcular=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return calcular;
    }
}