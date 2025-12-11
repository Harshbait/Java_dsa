public class stringCompresion {

    public static String compress(String str) {
        StringBuilder sc = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sc.append(str.charAt(i));
            if(count > 1) {
                sc.append(count.toString());
            }
        }
        return sc.toString();
    }

    public static void main(String[] args) {
        String str = "aaabcdd";
        // System.out.println(compress(str));
        String s = "Java";
        System.out.println(s);
        s = "UHIIUda";
        System.out.println(s);
    }
}
