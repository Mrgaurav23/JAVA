
public class binarySeach {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,12,23,45,56,70};
        int target = 23;

        int ans = Binary(arr, target);
        System.out.println( " Element at index :" + ans);
    }
    // 1.Write a code for binary Search
    public static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
