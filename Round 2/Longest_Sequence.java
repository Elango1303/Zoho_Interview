public class Longest_Sequence {
    static void main(String[] args) {

        String str = "aaaa";
        int ans = 0;

        for(int i = 0 ; i < str.length() ; i++){

            int temp = last_occ(str , str.charAt(i));

            int tem = temp - i - 1;
            if(temp != -1) ans = Math.max(tem , ans);
        }
        System.out.println(ans);


    }
    public static int last_occ(String str,char ch){

        int l = str.length() - 1;

        for(int i = l ; i >= 0 ; i--){
            if(ch == str.charAt(i)) return i;
        }
        return -1;
    }
}
