import java.util.Collection;

public class Decode_Encoded_String {
    static void main(String[] args) {
        String st = "a1b10";
        String str2 = "b3c6d15";

        System.out.println(Decode(st));
        System.out.println(Decode(str2));

    }

    public static String Decode(String str){
        String ans = "";

        for (int i = 1; i < str.length() ; i++) {
            char ch = str.charAt(i - 1);
            int n = 0;
            while(i < str.length() &&Character.isDigit(str.charAt(i))){
                n = n * 10 + (str.charAt(i) - '0');
                i++;
            }

            for (int j = 0; j < n; j++) {

                ans += ch;

            }
        }
        return ans;
    }

}
