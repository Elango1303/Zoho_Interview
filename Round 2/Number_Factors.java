import java.util.Arrays;

public class Number_Factors {
    public static void main(String[] args) {
        int[][] testCases = {
                {6, 8, 9},
                {12, 7, 15, 4},
                {1, 2, 3, 4, 5},
                {36, 25, 16},
                {100, 99, 98}
        };

        for (int[] arr : testCases) {
            System.out.println("Input:   " + Arrays.toString(arr));

            int[] arr2 = countFactors(arr);
            System.out.println("Output:  " + Arrays.toString(arr2));
            System.out.println(" ");

        }
    }


    public static int countfactors(int n){

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) count++;
        }
        return count;
    }
    public static int[] countFactors(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(countfactors(arr[j]) < countfactors(arr[j+1])){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
                else if(countfactors(arr[j]) == countfactors(arr[j+1])){
                    if(arr[j] < arr[j+1]){
                        int tem = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tem;
                    }
                }
            }
        }
        return arr;

    }
}
