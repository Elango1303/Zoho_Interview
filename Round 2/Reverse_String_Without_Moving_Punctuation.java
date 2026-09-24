public class Reverse_String_Without_Moving_Punctuation {
    public static void main(String[] args){
        String str = "a,b$c";
        char[] ch = str.toCharArray();

        int r = 0;
        int l = str.length() - 1;

        while (r < l){
            while (r < l && !Character.isLetterOrDigit(str.charAt(r))) r++;
            while (r < l && !Character.isLetterOrDigit(str.charAt(l))) l--;

            char temp = ch[r];
            ch[r] = ch[l];
            ch[l] = temp;

            r++;
            l--;
        }
        System.out.println(new String(ch));
    }
}
