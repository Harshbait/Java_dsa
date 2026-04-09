public class RotateStr {

    public static boolean rotateString(String s, String goal) {
        for(int i = 0; i < s.length(); i++) {
            if(s.equals(goal)) {
                return true;
            }

            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s, goal));

    }
}