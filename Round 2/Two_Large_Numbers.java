import java.util.*;

public class Two_Large_Numbers {

    static void main(String[] args) {
        int[] A = {9,2,8,1,3,5,6,7,3,1,1,6};
        int[] B = {7,8,4,6,2,1,9,9,7};
        int[] ans = addArrays(A,B);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");

        }


    }
    public static int[] addArrays(int[] num1, int[] num2) {

        int i = num1.length - 1;
        int j = num2.length - 1;
        int carry = 0;
        List<Integer> result = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += num1[i--];
            if (j >= 0) sum += num2[j--];
            carry = sum / 10;
            result.add(0, sum % 10);
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}

