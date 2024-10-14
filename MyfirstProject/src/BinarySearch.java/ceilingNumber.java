
public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9};
        int target = 5;

        int ans = ceilingNumber(arr, target);
        System.out.println( "Elementn at index:" +ans);
    }

    // Write a code for ceiling number in an array means target element is not
    // found so print next index
    public static int ceilingNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
