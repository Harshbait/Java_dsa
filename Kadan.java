public class Kadan {
    public static void kadanes(int number[]) {
        int Maxsum = Integer.MIN_VALUE;
        int curr = 0;

        boolean isNegative = true;
        for(int num : number) {
            if(num >= 0) {
                isNegative = false;
                break;
            }  
        }

        if(isNegative) {
            for(int num : number) {
                Maxsum = Math.max(num, Maxsum);   
            }       
            System.out.println(Maxsum);
            return;
        }

        for(int i = 0; i < number.length; i++) {
            curr = curr + number[i];

            if(curr < 0) {
                curr = 0;
            }
            Maxsum = Math.max(curr, Maxsum);
        }
        System.out.println(Maxsum);
    }
    public static void main(String[] args) {
        int number[] = {-2, -3, -3};
        kadanes(number);
    }   
}
