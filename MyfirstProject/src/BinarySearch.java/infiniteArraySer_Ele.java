public class infiniteArraySer_Ele {
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] nums = {1,2,7,7,8,8,9};
        int target = 8;

        System.out.println(ans(nums, target));
    }

        // 6. Find position of an element of sorted array in a infinite numbers.
        public static int BinarySearch(int[] arr, int target, int start, int end) {
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
         public static int ans(int arr[], int target) {
            int start = 0;
            int end = 1;
    
            while (target > arr[end]) {
                int newStart = end + 1;
                // double the box value.
                // end = previous end + sizeofbox*2.
                end = end + (end - start + 1) * 2;
                start = newStart;
            }
            return BinarySearch(arr, target, start, end);
        }
}
