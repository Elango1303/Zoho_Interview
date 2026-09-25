public class BetweenVowels
{
    public static void main(String[] args)
    {
        printVowels("single");
        printVowels("alphabet");
        printVowels("america");
    }
    public  static void printVowels(String str)
    {
        String ans= "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u') {
                String temp = "";
                int j = 0;
                if(i < str.length() - 2) j = i+1;
                while (str.charAt(j) != 'a' && str.charAt(j) != 'e' && str.charAt(j) != 'i'
                && str.charAt(j) != 'o' && str.charAt(j) != 'u'){
                    temp = temp + str.charAt(j);
                    j++;
                }

                if(ans.length() < temp.length()) ans = str.substring(i+1,j);
            }

        }
        System.out.println(ans);

    }
}
