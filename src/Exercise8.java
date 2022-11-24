public class Exercise8 {
    private int x;
    private int y;
    public Exercise8(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Exercise8() {
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

//Cree una clase Main (con un método principal) que declare un punto y luego lo mueva a un
//ubicación y luego imprime su valor llamando a su método toString().
