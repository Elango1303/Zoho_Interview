import java.util.Arrays;
import java.util.Stack;

public class Greater_on_Right_Side {
    static void main(String[] args) {

        int[] arr = {16,17,4,3,5};
        int[] ans = new int[arr.length];
        Arrays.fill(ans,-1);

        Stack<Integer> st = new Stack<>();

        int i = arr.length - 1;

        while(i >= 0){

            int n = arr[i];

            while(!st.empty() && st.peek() < n) st.pop();

            if(!st.empty() && n < st.peek()) ans[i] = st.peek();

            st.add(n);
            i--;
        }

        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j] + " ");
        }

    }
}
