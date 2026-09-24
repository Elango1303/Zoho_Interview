public class Replace_duplicates {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9, 9};
        replace(arr);

        for(int i :arr){
            System.out.print(i + " ");
        }
    }

    public static void replace(int[] arr){
      for(int i = 0 ; i < arr.length ; i++){
          for(int j = i + 1; j < arr.length; j++){
              if(arr[i] == arr[j]) arr[j] = arr[j]+1;
          }
      }
    }
    
}
