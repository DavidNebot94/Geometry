public class Exercise7 {
    private int x;
    private int y;
    public Exercise7(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise7() {
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

//Cree el método moveTo con 2 parámetros para poder mover el punto a la ubicación especificada.