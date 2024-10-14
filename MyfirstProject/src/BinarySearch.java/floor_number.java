public class floor_number {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9};
        int target = 5;

        int ans = floorNumber(arr, target);
        System.out.println( "Elementn at index:" +ans);
    }

    // 3. Write a code for floor number in an array means target element is not
    // found so print prev index.
    public static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
}
