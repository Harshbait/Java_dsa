import java.util.*;
// O(n)
public class DuplicateParenthisis {

    public static boolean duplicateParent(String str) {
        Stack<Character> word = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                int count = 0;
                while(word.peek() != '(') {
                    word.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    word.pop();
                }
            } else {
                word.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(duplicateParent(str));
    }
}
