
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // This is not making a new string it directly append char one by one
        // O(26) if we dose'nt use sb then we get O(26*n^2)
        for(char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
 