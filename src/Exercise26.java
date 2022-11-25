public class Exercise26 {
    private Exercise26() {
        // Constructor Exercise26
    }
    class Main {
        int i;
        private Main() {
            i = 5;
            System.out.println("Nombre del constructor");
        }
        public static void main(String[] args) {
            Main obj = new Main();
            System.out.println("I: " + obj.i);
        }
    }
}
