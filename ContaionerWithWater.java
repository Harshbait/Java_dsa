import java.util.*;

public class ContaionerWithWater {

    public static int height(ArrayList<Integer> height) {
        int max = 0;

        for(int i = 0; i < height.size(); i++) {
            for(int j = 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int waterContain = ht*width;
                if(max < waterContain) {
                    max = waterContain;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(height(list));
    }
}
