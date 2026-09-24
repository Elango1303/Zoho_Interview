public class Pattern {

    public static void main(String[] args) {

       pattern16(4);

    }

    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {{
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        }
    }
    public static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");

            }
            System.out.println();
            num++;

        }
    }
    public static void pattern5(int n){

        for (int i = 0; i < n; i++) {
            int s = n - i - 1;
            for (int j = 0; j < s; j++) System.out.print(" ");

            int sym = (i * 2) + 1;
            for (int k = 0; k < sym; k++) System.out.print("*");

            for (int j = 0; j < s; j++) System.out.print(" ");
            System.out.println();
        }

    }
    public static void pattern6(int n){

        for (int i = 0; i < n ; i++) {
            int s = i ;
            for (int j = 0; j < s; j++) System.out.print(" ");
            for (int j = 0; j < (n * 2) - (i * 2 + 1 ) ; j++) System.out.print("*");
            for (int j = 0; j < s; j++) System.out.print(" ");
            System.out.println();

        }
    }
    public static void pattern7(int n){
        for (int i = 0; i < n * 2 - 1; i++) {
            int s = i;
            if(s > n) s= 2 * n - i;
            for (int j = 0; j < s; j++) System.out.print("*");
            System.out.println();

        }
    }
    public static void pattern8(int n){
        int s =1;
        for (int i = 1; i <= n; i++) {
           if(i % 2 != 0) s= 1;
           else s= 0;
            for (int j = 0; j <= i ; j++) {
                System.out.print(s + " ");
                s = 1 - s;
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        int space = 2 * (n - 1);
        for (int i = 1; i <= n ; i++) {
            // numbe...
            for (int j = 1; j <= i; j++) System.out.print(j);
            //space...
            for (int j = 0; j < space; j++) System.out.print(" ");
            //number....
            for (int j = i; j >= 1 ; j--) System.out.print(j);
            System.out.println();
            space = space - 2;
        }
    }
    public static void pattern10(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char ch =(char) ('A' + (j - 1));
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
    public static void pattern11(int n){
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j <= (n - i -1) ; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                char ch = (char) ('A' + i);
                System.out.print(ch);

            }
            System.out.println();

        }
    }
    public static void pattern13(int n){

        for (int i = 1; i <= n; i++) {

            //space...
            for (int j = 1; j <= n -  i; j++) System.out.print(" ");

            for (int j = 1; j <= i ; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);

            }
            for (int j =i - 1; j >= 1 ; j--) {
                char ch = (char) ('A' + j -  1);
                System.out.print(ch);

            }
            for (int j = 1; j <= n -  i; j++) System.out.print(" ");


            System.out.println();

        }
    }
    public static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E' ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        int is = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < is; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            is += 2;
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            for (int j = 0; j < is; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            is -= 2;
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                int top = j;
                int bot = i;
                int ri = (2*n - 2) - j;
                int lef = (2*n - 2) - i;

                System.out.print(n - Math.min(Math.min(top,bot),Math.min(ri,lef)));
            }
            System.out.println();
        }
    }
}
