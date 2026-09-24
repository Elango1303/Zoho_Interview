public class Main {
    public static void main(String[] args) {

//        int[] arr={64,25,12,22,11};
//        SelectionSort(arr);
//        System.out.println("Sorted array:");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println(" ");

        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        
    }
   public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
   }
    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            sum += nums[i];

            if(sum >= target){
                ans =Math.min(ans,(i - left + 1));
                sum -= nums[left];
                left++;
            }

        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;

    }
    
}
