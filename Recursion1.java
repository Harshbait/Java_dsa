public class Recursion1 {
    
    public static void printDec(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n) {
        if(n <= 0) {
            return 1;
        }
        int nmin1 = fact(n-1);
        int fact = nmin1*n;
        return fact;
    }

    public static int sumNat(int n) {
        if(n == 1) {
            return 1;
        }
        int num = sumNat(n - 1);
        int sum = n + num;
        return sum;
    }

    //Calculate fibonachi
    public static int fibonachi(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fbnm1 = fibonachi(n -1);
        int fbnm2 = fibonachi(n - 2);
        int fbo = fbnm1 + fbnm2;
        return fbo;
    }

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcc(int arr[], int i, int j) {
        if(arr[i] == j) {
            return i;
        }

        if(i == arr.length-1) {
            return -1;
        }
        
        return firstOcc(arr, i+1, j);
    }
    public static int lastOcc(int arr[], int i, int j) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, i+1, j);
        if(isFound == -1 && arr[i] == j) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        int xnm1 = power(x, n-1);
        int xm = x*xnm1;
        return xm;
    }

    // O(log n)
    public static int optimizedPowe(int x, int n) {
        if(n == 0) {
            return 1;
        }

        int halfPower = optimizedPowe(x, n/2);
        int halfPowersq = halfPower * halfPower;

        //n is odd
        if(n %2 != 0) {
            halfPowersq = x * halfPowersq;
        }

        return halfPowersq;
    }

    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(5));
        // System.out.println(sumNat(n));
        // System.out.print("Fibonachi of: "+ n);
        // System.out.print(" is: "+fibonachi(n));

        //Sorted array code by Recursive function
        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(isSorted(arr, 0));
        // System.out.println("We found our element at index: "+firstOcc(arr, 0, 2));
        // System.out.println("We found our element at index: "+lastOcc(arr, 0, 2));
        // System.out.println(power(5, 2));
        System.out.println(optimizedPowe(5, 2));
    }   
}
