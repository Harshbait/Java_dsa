public class Permutation {
    //O(n * n!)
    public static void findPermutation(String s, String ans) {
        //base case
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }

        //recurASION
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            findPermutation(newStr, ans+curr);            
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        findPermutation(s, "");
    }
}
