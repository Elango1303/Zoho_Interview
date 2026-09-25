import java.util.Arrays;

public class SecondMax {
//    Given an array, modify it such that first maximum is in 0
//    th position, second maximum is
//    in n-1th position, third maximum 1st position and so on
//    Input [1,12,6,5,4]
//    Output: [12,5,1,4,6]

    static void main(String[] args) {
        int[] arr = {1,12,6,5,4};
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
            int ind1 = 0;
            int ind2 = arr.length-1;
            int i = arr.length-1;
            while(ind1<ind2){
                ans[ind1] = arr[i--];
                ind1++;
                ans[ind2] = arr[i--];
                ind2--;
            }

            ans[ind1] = arr[i];

            for(int n : ans) System.out.print(n + " ");
    }

}
