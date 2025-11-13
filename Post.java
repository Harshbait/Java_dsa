import java.util.Scanner;

public class Post{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter numb: ");

        // int num = sc.nextInt();

        // if(num < 0) {
        //     System.err.println("Negative");
        // }
        // else if(num > 0) {
        //     System.err.println("Positive");
        // }
        // else {
        //     System.out.print("Number is 0");
        // }

        //2nd

        // double temp = sc.nextInt();

        // if(temp > 100) {
        //     System.out.print("You have a feaver");
        // }
        // else {
        //     System.out.print("You don't have a feaver");
        // }

        //3rd

        int day = sc.nextInt();

        switch(day) {
            case 1: System.out.print("Sunday");
                    break;
            case 2: System.out.print("Monday");
                    break;
            case 3: System.out.print("Tuesday");
                    break;
            case 4: System.out.print("Wednesday");
                    break;
            case 5: System.out.print("Thrusday");
                    break;
            case 6: System.out.print("Friday");
                    break;
            case 7: System.out.print("Saturday");
                    break;

            default: System.out.println("You have entered wrong day");   
        }
    }   
}
    