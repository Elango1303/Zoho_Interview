public class ReverseWordsFromSubstring {

    public static String reverseFromSubstring(String s1, String s2) {

        String[] words = s1.split(" ");
        int st = -1;
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].contains(s2)) st = i;
        }

        if(st == -1) return s1;

        int end = words.length -1;

        while(st < end){
            String temp = words[st];
            words[st] = words[end];
            words[end] = temp;
            st++;
            end--;
        }

        return String.join(" ",words);


    }


    public static void main(String[] args) {
        System.out.println(reverseFromSubstring("This is a test String only", "st"));
        // → This is a only String test

        System.out.println(reverseFromSubstring("Hello world foo bar", "oo"));
        // → Hello only bar foo world  (starts at "world" — no, "world" has no "oo", "foo" does)
        // → Hello world bar foo

        System.out.println(reverseFromSubstring("No match here", "xyz"));
        // → No match here
    }
}