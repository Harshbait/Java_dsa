import java.util.*;
public class StackReverse {

    public static String revString(String str) {
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder word = new StringBuilder(" ");

        while(!ch.isEmpty()) {
            char tu = ch.pop();
            word.append(tu);
        }
        return word.toString();
    }

    public static void main(String[] args) {
        String hap = "Ladybug";
        String result = revString(hap);
        System.out.println(result);
    }
}
