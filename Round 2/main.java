public class main{
    static void main(String[] args) {
        int[][] dp = new int[7][7];

        for(int i = 0 ; i < dp.length ; i++){
            for (int j = 0; j < dp[0].length; j++) {

                if(i == 0 || j == 0) dp[i][j] = 1;

            }
        }

        for(int i = 1 ; i < dp.length ; i++){
            for (int j = 1; j < dp[0].length; j++) {

                dp[i][j] = dp[i-1][j] + dp[i][j-1];

            }
        }
        for(int i = 0 ; i < dp.length ; i++){
            for (int j = 0; j < dp[0].length; j++) {

                System.out.print(dp[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}