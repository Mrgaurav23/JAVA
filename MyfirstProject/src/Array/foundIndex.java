import java.util.Scanner;

public class foundIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // x index found.
        int size = scan.nextInt();
        int arr[] = new int[size];

        foundNum(arr, size);

    }

    public static int foundNum(int[] arr,int size){
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int x = scan.nextInt();

        //Output
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("x found at index :" + " " + i);
            }
        }
        return size;
    }
}
