
import java.util.Scanner;


public class Three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no of Number to enter: ");
        // int n = sc.nextInt();
        // int even = 0;
        // int odd = 0;

        
        // for(int i = 0; i < n; i++) {
        //     System.out.print("Enter num: ");
        //     int num = sc.nextInt();
        //     if(num % 2 == 0) 
        //         even += num; 
        //     else 
        //         odd += num;
        // }
        // System.out.println("Even: "+ even);
        // System.out.println("Odd: "+ odd);

        int ans = 1;
        
        System.out.print("Enter Number for factorial: ");        
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Number is negative");
        } else{
            for(int i = 1; i <= 10; i++) {
            ans = n*i;
            System.out.println("Factorial: "+ ans);
            
        }
        
        }
        sc.close();
        

    }
}