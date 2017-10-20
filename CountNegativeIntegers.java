/**
 * Created by HaMi on 2017-09-28.
 * This program looks at a sorted matrix and returns the number of negative integers
 * Assume that the matrix is n x m dimensions and that it is a matrix of integers
 * This solution has a time complexity of O(n+m)
 * Naive solution would be so traverse the matrix from left to right; worse case is if the entire matrix has negative numbers so travelling left to right on the enter matrix gives the naive solution a run time of O(nm)
 */
public class CountNegativeIntegers {
    public static void main(String[] args) {
        int[][] matrix = {{-3, -2, -1}, {-1, 0, 1}, {-2, -1, 0}};           // answer should be 6
        int[][] matrix2 = {{-3, -2,}, {-1, 0}, {-2, -1}};                   // answer should be 5
        int[][] matrix3 = {{-4, -3, -2, -1}, {-7, -6, -5, -4}};             // answer should be 8
        int results = countNeg(matrix, matrix.length, matrix[1].length);
        int results2 = countNeg(matrix2, matrix2.length, matrix2[1].length);
        int results3 = countNeg(matrix3, matrix3.length, matrix3[1].length);
        System.out.println(results);
        System.out.println(results2);
        System.out.println(results3);

    }

    private static int countNeg(int[][] matrix, int row, int col) {
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                if (matrix[i][j] < 0) {
                    counter += 1;
                }
            }
        }
        return counter;
    }
}
