public class Remove_Palindrome_Words {

    static void main(String[] args) {

        String str = "Malayalam is my mother tongue";
        String[] st = str.split(" ");
        String ans = " ";

        for(int i = 0 ; i < st.length ; i++){
            boolean temp = Cheack(st[i]);

            if(!temp) ans = ans + " " + st[i];
        }
        System.out.println(ans.trim());

    }
    public static boolean Cheack(String str){

        char[] ch = str.toCharArray();
        int r = 0;
        int l = ch.length - 1;

        while(r < l){

            if(Character.toLowerCase(ch[r]) != Character.toLowerCase(ch[l])) return false;
            r++;
            l--;
        }
        return true;
    }
}
