class Wildcard_Substring{

    static boolean wildCard(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int i = 0, j = 0, startIndex = -1, match = 0;

        while (i < n) {
            if (j < m && (pat.charAt(j) == '?' || pat.charAt(j) == txt.charAt(i))) {
                i++;
                j++;
            } else if (j < m && pat.charAt(j) == '*') {
                startIndex = j;
                match = i;
                j++;
            } else if (startIndex != -1) {
                j = startIndex + 1;
                match++;
                i = match;
            } else {
                return false;
            }
        }

        while (j < m && pat.charAt(j) == '*') j++;
        return j == m;
    }

    public static void main(String[] args) {
        System.out.println(wildCard("abcde", "a?c*"));   // true
        System.out.println(wildCard("abcde", "a*"));     // true
        System.out.println(wildCard("abcde", "*"));      // true
        System.out.println(wildCard("abcde", "a?d*"));   // false
        System.out.println(wildCard("hello", "h?llo"));  // true
        System.out.println(wildCard("hello", "h*o"));    // true
        System.out.println(wildCard("hello", "*world")); // false
        System.out.println(wildCard("",      "*"));      // true
        System.out.println(wildCard("abc",   "abc"));    // true
        System.out.println(wildCard("abc",   "ab?"));    // true
    }
}