public class SubMatrixSearch {

    static boolean isSubMatrix(int[][] large, int[][] small, int N, int M) {

        for(int i = 0 ; i <= N - M ; i++) {
            for (int j = 0; j <= N - M; j++) {

                if (Mach(large, small, i, j, M)) return true;

            }
        }
        return false;
    }
    public static boolean Mach(int[][] l,int[][] s, int row, int col , int si){

        for (int i = 0; i < si; i++) {
            for (int j = 0; j < si; j++) {
                if(l[i+row][j+col] != s[i][j]) return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        // Test 1: Sub-matrix exists → TRUE
        int[][] large1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };
        int[][] small1 = {
                {6, 7},
                {1, 2}
        };
        System.out.println("Test 1: " + isSubMatrix(large1, small1, 4, 2)); // TRUE

        // Test 2: Sub-matrix does NOT exist → FALSE
        int[][] large2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };
        int[][] small2 = {
                {6, 9},
                {1, 2}
        };
        System.out.println("Test 2: " + isSubMatrix(large2, small2, 4, 2)); // FALSE

        // Test 3: Sub-matrix at top-left corner → TRUE
        int[][] large3 = {
                {5, 8, 3, 4},
                {7, 2, 1, 6},
                {9, 4, 5, 3},
                {2, 1, 8, 7}
        };
        int[][] small3 = {
                {5, 8},
                {7, 2}
        };
        System.out.println("Test 3: " + isSubMatrix(large3, small3, 4, 2)); // TRUE

        // Test 4: Sub-matrix at bottom-right corner → TRUE
        int[][] large4 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 4, 6},
                {3, 5, 9, 2}
        };
        int[][] small4 = {
                {4, 6},
                {9, 2}
        };
        System.out.println("Test 4: " + isSubMatrix(large4, small4, 4, 2)); // TRUE

        // Test 5: Small = Large (M == N) → TRUE
        int[][] large5 = {
                {3, 7},
                {8, 1}
        };
        int[][] small5 = {
                {3, 7},
                {8, 1}
        };
        System.out.println("Test 5: " + isSubMatrix(large5, small5, 2, 2)); // TRUE

        // Test 6: 1x1 sub-matrix search → TRUE
        int[][] large6 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] small6 = {{9}};
        System.out.println("Test 6: " + isSubMatrix(large6, small6, 3, 1)); // TRUE
    }
}