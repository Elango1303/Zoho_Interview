import java.util.Arrays;

public class Largest_Smallest_Alternating {
    static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] ans = new int[arr.length];

        int i = 0;
        int l = arr.length - 1;
        int pos = 0;
        Arrays.sort(arr);

        while(i <= l){
            if(pos < arr.length)ans[pos++] = arr[l--];
            if(pos < ans.length) ans[pos++] = arr[i++];
        }
        for (int n : ans){
            System.out.print(n + " ");
        }
    }
}
