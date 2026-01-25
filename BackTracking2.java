public class BackTracking2 {

    public static void findSubsets(String str, String ans, int i) {
        //Base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str, ans, i+1);
    }

    public static void findPermuntation(String str, String ans) {
        // Base case
        if(str.length() == ans.length()) {
            System.out.println(ans);
        }

        //Kaam
    }vg

    public static void main(String[] args) {
        String str = "abc";    
        findSubsets(str, "", 0);
    }
}
