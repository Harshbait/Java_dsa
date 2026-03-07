import java.util.*;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total input: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
       
        for(int i = 1; i <= n; i++) {
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3); 
        }

        System.out.println("List1: "+list);
        System.out.println("List2: "+list2);
        System.out.println("List3: "+list3);

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        for(int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> cuArrayList = mainList.get(i);

            for(int j = 0; j < cuArrayList.size(); j++) {
                System.out.print(cuArrayList.get(j));
            }
            System.out.println();
        }
    }
}
