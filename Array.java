import java.util.Scanner;

public class Array {

    public static void update(int marco[]) {
        for(int i = 0; i < marco.length; i++) {
            marco[i] = marco[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[20];
        
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics: " + marks[0]);
        System.out.println("Maths: " + marks[1]);
        System.out.println("Java: " + marks[2]);


        System.out.println("Avg: " + (marks[0] + marks[1] + marks[2])/3);
        System.out.println("Arry length: " + marks.length);

        int marco[] = {56, 34, 67};

        update(marco);

        for(int i = 0; i < marco.length; i++) {
            System.out.println(marco[i]+" ");
        }
        
    }
}
