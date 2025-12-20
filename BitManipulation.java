
public class BitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((bitMask & n) == 0) {
            //even no
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void updateBit(int n, int i, int newBit) {
        
    }

    public static void main(String[] args) {
        // Performs AND opertion
        System.out.println(5 & 6);

        // Performs OR opertion
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);

        //Binary left shift a << b = a*2^b
        //                  5 << 2 = 5*2^2 = 20
        System.out.println(5 << 2);

        //Binary iright shift a >> b = a/2^b
        //                    6 >> 1 = 6/2^1 = 3
        System.out.println(6 >> 1);


        oddOrEven(2);

        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1 ));

    }
}
