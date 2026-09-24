import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    static Scanner sc = new Scanner(System.in);
    private char[][] board = null;
    private Queue<Node> snake = new LinkedList<Node>();
    private Queue<Node> food = new LinkedList<>();

    public  Game(int row, int col) {
        board = new char[row][col];
        snake.add(new Node(0, 0));
        food.add(new Node(3, 2));
        food.add(new Node(2, 1));
        food.add(new Node(2, 2));
        food.add(new Node(1, 1));
        food.add(new Node(0, 0));
        food.add(new Node(1, 4));
        displayFood(food.poll());
    }

    public void Play_Game(int row, int col) {
        if(row >= 0 && col >= 0 && row < board.length && col < board[0].length) {
            snake.add(new Node(row, col));
            if(board[row][col] != 'X') {
                Node node = snake.poll();
                int r = node.getRow();
                int c = node.getCol();
                board[r][c] = '\0';
            }
            if (board[row][col] == 'X') {
                if(food.isEmpty()) {
                    Move_Forward(row, col);
                    System.out.println("You Win The Game...!");
                    System.exit(0);
                }
                displayFood(food.poll());
            }
            if (board[row][col] == '.') {
                System.out.println("Invalid Move.");
                System.exit(0);
            }
            Move_Forward(row, col);
            System.out.println("Enter Your Move");
            char move = sc.next().charAt(0);

            if(!snake.isEmpty()) {
                if(move == 'U') Play_Game(row - 1,col);
                else if(move == 'D') Play_Game(row+1,col);
                else if(move == 'R') Play_Game(row,col+1);
                else if(move == 'L') Play_Game(row,col-1);
                else {
                    System.out.println("Invalid Move.");
                    System.exit(0);
                }
            }
        }
        else{
            System.out.println("Game Over Reason is OutofBounds....");
            System.exit(0);
        }
    }

    private void Move_Forward(int row, int col) {
        board[row][col] = '.';
        PrintBoard();
    }


    private void displayFood(Node node) {
        int row = node.getRow();
        int col = node.getCol();
        board[row][col] = 'X';
    }

    public void PrintBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
