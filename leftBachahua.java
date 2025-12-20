public class  leftBachahua {

    public static int arr(int n[]) {
        int ans = 0;

        for(int i = 0; i < n.length; i++) {
            ans ^= n[i];
        }  
        return ans;
    }

    public static int simpleAdd(int num) {
        int mask = 1;

        while((num & mask) != 0) {
            num ^= mask;
            mask <<=1;
        }
        num ^= mask;

        return num;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 1, 2, 3, 3, 1};
        System.out.print(arr(num));

        int a = 5;
        int b = 10;
        System.out.println("Without making/using 3rd vairable swaping: ");
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

        //Simple bit addition
        System.out.println(simpleAdd(5));


    }
}
