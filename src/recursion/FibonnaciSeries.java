package recursion;

public class FibonnaciSeries {


    public static void main(String... args) {
        FibonnaciSeries fib = new FibonnaciSeries();
        int n = 10, c = 0;
        for (int i = 1; i <= n; i++) {
            int out = fib.calculateFibona(c);
            System.out.println(out);
            c++;
        }
    }

    private int calculateFibona(int n) {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return n;
        return calculateFibona(n - 1) + calculateFibona(n - 2);
    }


}
