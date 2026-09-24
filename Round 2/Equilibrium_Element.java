public class Equilibrium_Element {

    static void main(String[] args) {
        int[] arr= {1, 2, 3, 7, 6};

        int[] lsum = new int[arr.length];
        int[] rsum = new int[arr.length];

        for(int i = 1 ;i < arr.length ; i++){
            lsum[i] = lsum[i-1] + arr[i-1];
        }
        for (int i = arr.length - 2;  i >= 0 ; i--) {
            rsum[i] = rsum[i+1] + arr[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
           if(rsum[i] == lsum[i]) System.out.println(arr[i]);
        }
    }
}
