
public class Sort {

    public static void bubbleSort(int num[]) {
        for(int i = 0; i < num.length-1; i++) {
            for(int j = 0; j < num.length-1-i; j++) {
                if(num[j] > num[j+1]) {
                    int temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int num[]) {
        
        for(int i = 0; i < num.length-1; i++) {
            int minElemPosition = i;
            for(int j = i+1; j < num.length; j++) {
                if(num[minElemPosition] > num[j]) {
                    minElemPosition = j;
                }
            }
            int temp = num[minElemPosition];
            num[minElemPosition] = num[i];
            num[i] = temp;
        }

        for(int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int num[]) {
        for(int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i-1;

            while(prev >= 0 && curr < num[prev]) {
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev + 1] = curr;
        }

        for(int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
    }

    public static void countingSort(int num[]) {
        int largeVal = Integer.MIN_VALUE;
            for (int i = 0; i < num.length; i++) {
                largeVal = Math.max(largeVal, num[i]);
            }

            int count[] = new int[num.length+1];
            for(int i = 0; i < num.length; i++) {
                count[num[i]]++;
            }

            //Sorting
            int j = 0;
            for(int i = 0; i < count.length; i++) {
                while(count[i] > 0) {
                    num[j] = i;
                    j++;
                    count[i]--;
                }
            }

            for(int i = 0; i < num.length; i++) {
                System.out.print(num[i]);
            }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        countingSort(arr);


    }
}
