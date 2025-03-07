import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,-6,4,3,1};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current  = arr[i];

            int j = i - 1;

            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }
}
