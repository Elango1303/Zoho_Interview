public static int find_Extra(int[] A, int[] B) {
    // your logic here

    for (int i = 0; i < A.length; i++) {
        boolean ans = false;
        for (int j = 0; j < B.length; j++) {
            if(A[i] == B[j]) ans = true;

        }
        if(!ans) return A[i];

    }

    return A[A.length - 1];
}

public static void main(String[] args) {
    int[] A = {10, 20, 30, 12, 5};
    int[] B = {10, 12, 30, 20,66};

    int extra = find_Extra(A,B);

    for (int i = 0; i < A.length; i++) {
        if (A[i] == extra) {
            System.out.println("Extra element: " + extra + " at index: " + i);
        }
    }
}