package Arrays;

public class MatrixDiagonalSum {
    public static void main(String... args) {

        MatrixDiagonalSum sum = new MatrixDiagonalSum();
        int[][] a = {{1,2,3},{4,5,6}, {7,8,9}};
        System.out.println(sum.digonalSum(a));

    }


    public int digonalSum(int[][] a) {

        if (a.length != a[0].length)
            return 0;
        int length = a.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + a[i][i];
        }

        return sum;

    }
}
