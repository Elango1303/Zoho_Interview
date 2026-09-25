public class MinMax_Rearrage {
//    Sort the given integer array in format
//1st element - 1st maximum of the array
//2nd element - 1st minimum of the array
//3rd element - 2nd maximum of the array
//4th element - 2nd minimum of the array
//5th element - 3rd maximum of the array
//6th element - 3rd minimum of the array…..This pattern follows
//    Constraints : Don't use any extra array(i.e Space Complexity - O(1) ) ,
//    modify the array in-place .
//            Don't use any inbuilt sort method of java or python
//    Input : array = {8,16,10,4,12,6,-3,0}
//    output : array = {16, -3, 12, 0, 10, 4, 8, 6}
//    Input : array = {5,3,1,7,2,4,6}
//    output : array = {7, 1, 6, 2, 5, 3, 4}
static void main(String[] args) {
    int[] arr = {8,16,10,4,12,6,-3,0};

    for(int i = 0; i < arr.length; i++){
        int min = i;
        int max = i;

        for(int j = i; j < arr.length; j++){
            if(arr[j] < arr[min]) min = j;
            if(arr[j] > arr[max]) max = j;

        }
        swap(arr,i,max);
        i++;
        swap(arr,i,min);

    }
    for(int n : arr){
        System.out.print(n + " ");
    }
}
public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

}
}
