public class Word_from_Middle_Outward {

    public static void main(String[] args) {
        String str = "PROGRAM";
        print(str);
    }

    public static void print(String str){
        int s = str.length() / 2;
        String ans = "";

        for (int i = 0; i < str.length() ; i++) {
            ans = ans + str.charAt((i + s) % str.length());
            System.out.println(ans + " " );

        }
    }
}
