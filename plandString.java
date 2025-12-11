
public class plandString {
    public static boolean pland(String str) {
        for(int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                System.out.println("Not");
                return false;
            }
        }
        System.out.println("FOund");
        return true;
    }

    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if(dir == 'S') {
                y--;
            }

            else if(dir == 'N') {
                y++;
            }

            else if(dir == 'E') {
                x++;
            }

            else {
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String str = "racecar";    
        pland(str);    

        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}