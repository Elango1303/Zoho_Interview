public class Triangular_Column_Pattern {

    static void main(String[] args) {
        print(6);
    }
    public static void print(int n){

        for (int i = 1; i <= n; i++) {
            int num = i;
            int gap = n;
            for (int j = 1; j <= n-i; j++) {
                System.out.print(num + " ");
                num += gap;
                gap++;

            }
            System.out.println();
        }
    }
}
