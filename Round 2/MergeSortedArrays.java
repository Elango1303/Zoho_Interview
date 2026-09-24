public class MergeSortedArrays {

    static void main(String[] args) {
        int[] A = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] B = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        //output : Output: 2 3 4 5 6 7 8 9 10 11 13 15

        int[] res = new int[A.length + B.length];

        int i=0,j=0,k=0;
        int last = Integer.MIN_VALUE;

        while(i < A.length && B.length > j){
            int val = 0;
            if(A[i] >= B[j]){
                val = B[j];
                j++;
            }
            else {
                val = A[i];
                i++;
            }

            if(val != last){
                res[k++] = val;
                last = val;
            }
        }

        while(i < A.length){
            res[k++] =A[i++];
        }
        while (j < B.length) res[k++] = B[j++];

        for (int l = 0; l < k; l++) System.out.print(res[l] + " ");

    }
}
