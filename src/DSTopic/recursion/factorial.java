package DSTopic.recursion;

public class factorial {

    public static void main(String... args) {
        factorial fact = new factorial();
        int output = fact.factorialofn(10);
        System.out.println(output);
    }
    public int factorialofn(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return 1;
        return n * factorialofn(n - 1);
    }


}
