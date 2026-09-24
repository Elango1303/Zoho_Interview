public class bublesort {
    static void main(String[] args) {

        int[] arr = {1,245,0,45,77,99,100,1,6,334,78445,24,22,6};
        sort(arr);
        for(int i : arr) System.out.print(i + " ");

    }
    public static void sort(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i ; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}