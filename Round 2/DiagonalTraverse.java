public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int idx = 0;

        int row = 0, col = 0;

        for (int i = 0; i < rows * cols; i++) {

            result[idx++] = mat[row][col];

            if ((row + col) % 2 == 0) {
                // Going UP (row--, col++)

                if (col == cols - 1) {
                    // Hit right wall → move down
                    row++;
                } else if (row == 0) {
                    // Hit top wall → move right
                    col++;
                } else {
                    // Free to go up
                    row--;
                    col++;
                }

            } else {
                // Going DOWN (row++, col--)

                if (row == rows - 1) {
                    // Hit bottom wall → move right
                    col++;
                } else if (col == 0) {
                    // Hit left wall → move down
                    row++;
                } else {
                    // Free to go down
                    row--;
                    col--;
                    // correction: going down means row++, col--
                    row += 2;  // undo the mistake above
                }
            }
        }

        return result;
    }

    public static void printResult(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        // Test 1 — 3x3
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("Test 1: ");
        printResult(findDiagonalOrder(mat1));
        // [1, 2, 4, 7, 5, 3, 6, 8, 9]

        // Test 2 — single row
        int[][] mat2 = {{1, 2, 3}};
        System.out.print("Test 2: ");
        printResult(findDiagonalOrder(mat2));
        // [1, 2, 3]

        // Test 3 — single column
        int[][] mat3 = {{1}, {2}, {3}};
        System.out.print("Test 3: ");
        printResult(findDiagonalOrder(mat3));
        // [1, 2, 3]

        // Test 4 — single element
        int[][] mat4 = {{5}};
        System.out.print("Test 4: ");
        printResult(findDiagonalOrder(mat4));
        // [5]

        // Test 5 — 2x3
        int[][] mat5 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.print("Test 5: ");
        printResult(findDiagonalOrder(mat5));
        // [1, 2, 4, 5, 3, 6]
    }
}