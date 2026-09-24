import java.util.Arrays;

public class Anagram_Finder {

    public static void main(String[] args) {

        String[] words  = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
        String   target = "ate";
        for (int i = 0; i < words.length; i++) {

            boolean ans = check(words[i],target );

            if(ans) System.out.println(words[i]);

        }
    }

    public static boolean check(String str1,String str2){

        if(str1.length() != str2.length()) return false;
        int count = 0;
        char[] arr1 =str1.toCharArray();
        char[] arr2 =str2.toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        for(char ch : arr1){
            if(ch == arr2[count]) count++;
        }

        return count == str2.length();
    }
}
