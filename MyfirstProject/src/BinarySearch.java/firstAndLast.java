public class firstAndLast {

    public static void main(String[] args) {
        int[] nums = {1,2,7,7,8,8,9};
        int target = 8;

        int[] ans = searchRange(nums, target);
        System.out.println("Element at index:" + ans);

    }

    // 5.Find First and last position of element in sorted array.
    // Facebook interview problem.
    // if target is not found in an array return [-1,-1].
    // Time complexity = O(logn)

    // Input arr = [5,7,7,8,8,10],target = 8;
    // Output = [3,4]
    public static int[] searchRange(int[] nums, int target) {
        // array ans start with -1 index and end also with -1 index.
        int[] ans = { -1, -1 };

        int start = firstAndLastPositionn(nums, target, true);
        int end = firstAndLastPositionn(nums, target, false);

        // Here index value of array is 0 in start
        ans[0] = start;
        // // Here index value of array is 1 in end
        ans[1] = end;

        return ans;
    }
    public static int firstAndLastPositionn(int[] nums, int target, boolean findStartIndex) {
        // ans start with -1.
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential ans found
                // Here we checking the same element in an array of first and last index.
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
