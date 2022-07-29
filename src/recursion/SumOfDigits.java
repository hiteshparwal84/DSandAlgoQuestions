package recursion;

public class SumOfDigits {


    public static void main(String...args)
    {
        SumOfDigits sumDigit = new SumOfDigits();

        System.out.println(sumDigit.sum(54121));
    }


    public int sum(int n)
    {
        if(n==0)
        return  0;
        return n%10 + sum(n/10);

    }
}
