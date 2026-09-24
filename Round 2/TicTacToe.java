import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] bord = new char[3][3];
        for (int i = 0; i < bord.length ; i++) {
            for (int j = 0; j < bord[i].length ; j++) {
                bord[i][j] = ' ';
            }
        }
        char player = 'X';
        boolean Game = false;

        while (!Game){
            Print_bord(bord);
            System.out.println("Enter the row for: " + player);
            int row = sc.nextInt();
            System.out.println("Enter the colum :"+ player);
            int col = sc.nextInt();
            if(bord[row][col] == ' '){
                bord[row][col] = player;
                if(!win(bord,player)){
                    if(player == 'X') player = 'O';
                    else player = 'X';
                }
                else {
                    System.out.println("Player  " + player + " win...........");
                    break;
                }

            }
            else System.out.println("Invalide move try agine...!" + player);

        }

    }

    // Method For Print The Bord....!
    public static void Print_bord(char[][] bord){
        for (int i = 0; i < bord.length ; i++) {
            for (int j = 0; j < bord[i].length ; j++) {
                System.out.print(bord[i][j] + "|");
            }
            System.out.println(" ");
        }

    }
    //Check the win...!
    public static boolean win(char[][] bord,char player){

        for (int i = 0; i < bord.length ; i++) {
           if(bord[i][0] == player && bord[i][1] == player && bord[i][2] == player) return true;
           if(bord[0][i] == player && bord[1][i] == player && bord[2][i] == player) return true;
        }
        if(bord[0][0] == player && bord[1][1] == player && bord[2][2] == player) return true;
        if(bord[0][2] == player && bord[1][1] == player && bord[2][0] == player) return true;

        return false;
    }
    
}
