public class PalindromeChecker {

    public static boolean isPalindrome(String s) {

        char[] ch = s.toCharArray();
        int r = 0;
        int l = ch.length - 1;

        while (r < l){
            while (r < l && !Character.isLetter(ch[r])) r++;
            while (r < l && !Character.isLetter(ch[l])) l--;

            if(Character.toLowerCase(ch[r]) != Character.toLowerCase(ch[l])) return false;
            r++;
            l--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("RACE CAR"));           // true
        System.out.println(isPalindrome("I DID, DID I?"));       // true
        System.out.println(isPalindrome("hello"));                // false
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
    }
}