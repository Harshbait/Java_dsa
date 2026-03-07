import java.util.*;

public class StackParenthisis {
    public static boolean isValid(String str) {
        Stack<Character> work = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);

             if(ch == '(' || ch == '[' || ch == '{') {
                work.push(ch);
             } else {
                if(work.isEmpty()) {
                    return false;
                } 
                if(work.peek() == '(' && ch == ')' 
                    || work.peek() == '[' && ch == ']'
                    || work.peek() == '{' && ch == '}' ) {
                        work.pop();
                } else {
                    return false;
                }
             }    
        }
        if(work.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({}[]";
        System.out.println(isValid(str));

    }
}
