public class Number_Staircase {

    static void main(String[] args) {
        print(4);
    }
    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((((i+j-2) % n )+1) + " ");
            }
            System.out.println();
        }
    }
}
