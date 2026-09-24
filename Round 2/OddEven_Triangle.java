public class OddEven_Triangle {

    static void main(String[] args) {
        print(6);
    }
    public static void print(int n){
        int even = 2;
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if(i % 2 == 0){
                    System.out.print(even +" ");
                    even += 2;
                }

                else {
                    System.out.print(odd + " ");
                    odd += 2;
                }


            }

            System.out.println();

        }
    }
}
