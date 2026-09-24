public class Check_Subsequence {

    public static void main(String[] args) {



        //System.out.println(c);
        System.out.println(check("abcde", "ace"));      // true
        System.out.println(check("abcde", "aec"));      // false

        System.out.println(check("programming", "pgm")); // true
        System.out.println(check("programming", "mgr")); // false

        System.out.println(check("abcdef", "abc"));      // true
        System.out.println(check("abcdef", "af"));       // true
        System.out.println(check("abcdef", "fa"));       // false

        System.out.println(check("hello", "hlo"));       // true
        System.out.println(check("hello", "heo"));       // true
        System.out.println(check("hello", "hoe"));       // false
    }

    public static boolean check(String s1,String s2){
        boolean ans = false;
        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            if(j == s2.length()) return true;
        }

        return ans;
    }
}
