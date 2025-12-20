import java.util.*;

public class dsa {
    public static boolean setithBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) != 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print(setithBit(4, 2));
    }
}
