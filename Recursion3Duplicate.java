public class Recursion3Duplicate {

    public static void removeDuplicate(String str, int idx, boolean map[], StringBuilder newString) {

        //base case
        if(idx == str.length()) {
            System.out.print(newString);
            return;
        }

        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeDuplicate(str, idx+1, map, newString);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, map, newString.append(currChar));
            
        }
    }

    public static void main(String[] args) {
        String str = "aayusyh";
        removeDuplicate(str, 0, new boolean[26], new StringBuilder(""));    
    }
}