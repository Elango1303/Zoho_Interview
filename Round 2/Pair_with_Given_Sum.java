import java.util.ArrayList;
import java.util.List;

public class Pair_with_Given_Sum {

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        int sum = 5;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            List<Integer> list1 = new ArrayList<>();
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    list1.add(arr[i]);
                    list1.add(arr[j]);
                }
            }
            if(!list1.isEmpty()) {
                list.add(list1);
            }
        }
        System.out.println(list);

    }

}
