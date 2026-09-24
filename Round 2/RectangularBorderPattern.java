public class RectangularBorderPattern {

    static void main(String[] args) {
        print(11,11);
    }
    public static void print(int O , int I){
        for (int i = 0; i < O ; i++) {
            for (int j = 0; j < I; j++) {
                int layer = Math.min(Math.min(i,j),Math.min((O-1-i),(I-1-j)));
                if(layer % 2 == 0) System.out.print("X ");
                else System.out.print("O ");


            }
            System.out.println();
            
        }
    }
}
