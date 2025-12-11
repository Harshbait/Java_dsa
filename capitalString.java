
public class capitalString {

    public static String ctring(String sc) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(sc.charAt(0));
        sb.append(ch);

        for(int i =1; i < sc.length(); i++) {
            if(sc.charAt(i) == ' ' && i < sc.length()-1) {
                sb.append(sc.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sc.charAt(i)));
            }
            else{
                sb.append(sc.charAt(i));
            }
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String sc = "I am harsh";
        System.out.println(ctring(sc));
    }
}
