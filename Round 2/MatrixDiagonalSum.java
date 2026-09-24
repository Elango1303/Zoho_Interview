
public class MatrixDiagonalSum {

    static int diagonalSum(int[][] matrix, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


    public static void main(String[] args) {

        // Test 1: Standard 3x3 → 1+5+9 = 15
        int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Test 1: " + diagonalSum(m1, 3)); // 15

        // Test 2: All same values
        int[][] m2 = {{3,0,0},{0,3,0},{0,0,3}};
        System.out.println("Test 2: " + diagonalSum(m2, 3)); // 9

        // Test 3: 4x4 matrix
        int[][] m3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Test 3: " + diagonalSum(m3, 4)); // 34

        // Test 4: 1x1 matrix
        int[][] m4 = {{42}};
        System.out.println("Test 4: " + diagonalSum(m4, 1)); // 42

        // Test 5: Zeros matrix
        int[][] m5 = {{0,1,2},{3,0,4},{5,6,0}};
        System.out.println("Test 5: " + diagonalSum(m5, 3)); // 0
    }
}