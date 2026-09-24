public class Reverse_Only_Vowels {

    static void main(String[] args) {
        String str = "abcdef";
        char[] ch = str.toCharArray();
        int r = 0;
        int l = ch.length - 1;

        while(r < l){
            while(r < l && !check(ch[r])) r++;
            while (r < l && !check(ch[l])) l--;

            char tem = ch[r];
            ch[r] = ch[l];
            ch[l] = tem;
            r++;
            l--;
        }
        System.out.println(new String(ch));
    }
    public static boolean check(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;

        return  false;
    }
}
