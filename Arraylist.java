import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);

        // 0
        // System.out.println(list);
        // int ele = list.get(3);

        // System.out.println(ele);
        // list.remove(2);

        // System.out.println(list);

        // list.set(2, 10);
        // System.out.println(list);

        //2
        // for(int i = list.size()-1; i >= 0; i--) {
        //     System.out.print(list.get(i) +" ");
        // }

        // 3 Max
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < list.size(); i++) {
        //     // if(list.get(i) > max) {
        //     //     max = list.get(i);
        //     // }  

        //     //OR

        //     max = Math.max(list.get(i), max);
        // }

        // System.out.println(max);

        // 4 Swap 2 numbers
        // int idx1 = 2;
        // int idx2 = 3;
        // System.out.println(list);

        // swap(list, idx1, idx2);
        // System.out.println(list);

        //5 Sorting in arraylist
        // Collections.sort(list);
        // System.out.println(list);

        // //Decending order
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
    }
}
