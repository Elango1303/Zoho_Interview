import java.util.Arrays;
public class MergeAndShift {

    public static void main(String[] args) {
        int[][] tests = {
                {2, 2, 2, 2},         // → [4, 4, 0, 0]
                {2, 2, 4, 4},         // → [4, 8, 0, 0]
                {0, 2, 2, 0},         // → [4, 0, 0, 0]
                {2, 2, 2, 4},         // → [4, 2, 4, 0]
                {4, 4, 4, 4},         // → [8, 8, 0, 0]
                {1, 1, 2, 2, 3, 3},   // → [2, 4, 6, 0, 0, 0]
                {5, 5, 5},            // → [10, 5, 0]
        };

        for (int[] test : tests) {
            System.out.println("Input:  " + Arrays.toString(test));
            System.out.println("Output: " + Arrays.toString(mergeAndShift(test)));
            System.out.println();
        }
    }
    public static int[] mergeAndShift(int[] arr){

        int[] res =new int[arr.length];

        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] != 0 && arr[i] == arr[i+1]){
                arr[i] = arr[i] * 2;
                arr[i+1] = 0;
                i++;
            }
        }
        int pos = 0;
        for (int  i = 0;  i < arr.length;  i++) {
            if(arr[i] != 0) res[pos++] = arr[i];

        }
        return res;

    }
}
