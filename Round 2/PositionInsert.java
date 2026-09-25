public class PositionInsert {

//    Given a sorted array find the position to insert the value
//    arr = [1, 3, 4, 5, 6, 8], x=2
//    Output: 1,3
//    arr = [2,4,6,8,10], x=6
//    Output: 6 is already present
//    arr = [-1, 0, 1, 4], x=11
//    Output: 10, NULL

    static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 8};
        findPosition(arr1, 2);

        int[] arr2 = {2, 4, 6, 8, 10};
        findPosition(arr2, 6);

        int[] arr3 = {-1, 0, 1, 4};
        findPosition(arr3, 11);
    }
    public static void findPosition(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        if(arr[right]  < k) System.out.println(-1 + " " + -1);

        else{
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == k) {
                    System.out.println(arr[mid - 1] + " " + arr[mid + 1]);
                    return;
                }

                else if (arr[mid] < k) left = mid + 1;
                else right = mid - 1;
            }

            System.out.println(arr[left] + " " + arr[right] + " = " + k );
        }


    }
}
