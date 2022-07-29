package DSTopic.recursion;

public class power {

    public static void main(String... args) {
        power p = new power();
        System.out.println(p.calculatePower(2, 4));
    }


    public int calculatePower(int base, int exp) {

        if (exp == 1) {
            return base;
        }
        return base * calculatePower(base, exp - 1);

    }
}
