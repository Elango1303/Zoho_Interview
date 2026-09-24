public class Leetcode {

    static void main(String[] args) {
        findMin(new int[]{3,4,5,1,2});
    }

    public static int findMin(int[] nums) {
//153. Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) /2;
            if(nums[mid] < nums[high]) high = mid;
            else low = mid + 1;
        }
        return nums[low];

    }
}
