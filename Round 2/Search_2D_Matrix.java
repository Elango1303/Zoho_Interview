public class Search_2D_Matrix {
    static void main(String[] args) {
        String str = "WELCOMETOZOHOCORPORATION";
        String str2 = "ORP";
        int col = 5;
        int ro = (int) Math.ceil((double) str.length() / col);
        char[][] arr =new char[ro][col];
        int k = 0;

        for (int i = 0; i < ro; i++) {
            for (int j = 0; j <col ; j++) {
                if(k < str.length()) arr[i][j] = str.charAt(k++);
                else arr[i][j] = ' ';

            }
        }
        for (int i = 0; i < ro; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println(" ");
        }

        System.out.println(str2);
        System.out.println(" ");

        for (int i = 0; i < ro; i++) {
            for (int j = 0; j < col ; j++) {

                if(arr[i][j] == str2.charAt(0)){
                    int cr = i;
                    int cc = j;
                    int m = 0;

                    while (m < str2.length()){
                        if(cr >= ro) {

                            break;
                        }
                        if(arr[cr][cc] != str2.charAt(m)){

                            break;
                        }
                        m++;
                        cc++;
                        if(cc == col) {
                            cc = 0;
                            cr++;
                        }
                    }
                    if(m == str2.length()){
                        System.out.println(i + " " + j);
                        System.out.println(cr + " " + --cc);
                        break;
                    }

                }




            }

        }


    }
}
