package DSTopic.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MatrixRotation {


    public static void main(String[] args) {
        MatrixRotation mn = new MatrixRotation();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        mn.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private void rotateMatrix(int[][] matrix) {
        int length = matrix.length;
        Queue<Integer> q = new LinkedList<>();
        int j = 0;
        while (length != 0) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                int val = matrix[i][j];
                q.add(val);
            }
            j++;
            length--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                matrix[i][k] = q.poll();
            }
        }

    }
}
