import java.util.*;
public class Exercise28 {
    static class GFG{

        static final double PI = 3.14159265;
        static double findInteriorAngle(int n)
        {
            return ((n - 2) * PI) / n;
        }
        static double calculateSideLength(double L,
                                          int N, int K)
        {
            double angle = findInteriorAngle(N);
            double length = L * Math.pow(Math.sin(angle / 2),
                    (K - 1));
            return length;
        }
        public static void main(String[] args)
        {
            double L = 21;
            int N = 5, K = 7;
            System.out.print(calculateSideLength(L, N, K));
        }
    }
}
