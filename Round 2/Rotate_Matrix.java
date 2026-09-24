public class Rotate_Matrix {

    public static void main(String[] args){
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int degree = 90;

        degree = degree % 360;
        int times = degree / 90;

        for(int k = 0; k < times; k++){
            Roatate(mat);
        }

        for(int i = 0 ; i < mat.length ; i++){
            for(int  j = 0 ; j < mat[i].length ; j++){
                System.out.print(mat[i][j] + " ");

            }
            System.out.println("");
        }


    }

    public static int[][] Roatate(int[][] arr){
        //Transpose.....

        for(int i = 0 ; i < arr.length ; i++){
            for(int  j = i + 1 ; j < arr.length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            int r = arr.length - 1;
            while (l < r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }

        }
        return arr;
    }
}
