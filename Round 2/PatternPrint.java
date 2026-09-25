public class PatternPrint {
    
    public static void main(String[] args) {
        print(6);
    }
    
    public static void print(int n){
        int num = 1;
        int[][] arr = new int[n][n];
       for(int i = 0; i < n; i++){
           for (int j = i; j < n  ; j++) {
               arr[j][i] = num++;
           }
       }
       for(int i = 0; i < n; i++){

           for(int s = 0; s <= n - i - 1; s++){
               System.out.print("\t");
           }
           for(int j = i; j >= 0; j--){
               System.out.print(arr[i][j] + "\t");
           }
           System.out.println();
       }
    }
}
