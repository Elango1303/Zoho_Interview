public class SquareInRange {
    public static void main(String[] args) {
        int a = 20, b = 100;

        int i = 1;
        while (i * i <= b) {
            if (i * i >= a) {
                System.out.print(i * i + " ");
            }
            i++;
        }
    }
}