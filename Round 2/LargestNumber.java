import java.util.Arrays;

public class LargestNumber {

    static void customSort(int[] arr) {

        String[] str = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        /// Sorting.......

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1; j++) {

                String ab = str[j] + str[j+1];
                String ba = str[j+1] + str[j];

                if(ab.compareTo(ba) < 0){
                    String temp = str[j+1];
                    str[j+1] = str[j];
                    str[j] = temp;
                }
            }
        }
        String ans = "";
        for (String s : str) ans+= s;

        if(ans.charAt(0) == '0') System.out.println(0);
       else{
           System.out.println(ans);
        }

    }

    public static void main(String[] args) {
        int[][] testCases = {
                {10, 2, 45, 3},
                {3, 30, 34, 5, 9},
                {1, 1, 1},
                {0, 0, 0},
                {9, 99, 999},
                {54, 546, 548, 60}
        };

        for (int[] arr : testCases) {
            System.out.print("Input:  " + Arrays.toString(arr));
            System.out.print("\nOutput: ");
            customSort(arr);
            System.out.println();
        }
    }
}