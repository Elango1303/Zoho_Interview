import java.util.Arrays;

public class Sort_by_Minimum_Factor {

    static void main(String[] args) {

        int[][] testCases = {
                {20, 7, 12, 15, 9},//Output:  [20, 12, 15, 9, 7]
                {10, 3, 14, 21, 25},// Output:  [14, 10, 21, 3, 25]
                {2, 3, 5, 7, 11},// Output:  [2, 3, 5, 7, 11]
                {4, 9, 25, 49}, // Output:  [4, 9, 25, 49]
                {30, 35, 6, 15} // Output:  [30, 6, 15, 35]
        };

        for(int[] arr : testCases){
            System.out.println("Input  :"+Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 ; j++) {
                    if(factor(arr[j]) > factor(arr[j+1])){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    } else if (factor(arr[j]) == factor(arr[j+1])) {
                        if(arr[j+1] > arr[j]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
            System.out.println("Output  :"+Arrays.toString(arr));
            System.out.println();

        }


    }
    public static int factor(int n){
        for (int i = 2; i <= n; i++) {
            if(n % i == 0) return i;
        }
        return n;
    }
}
