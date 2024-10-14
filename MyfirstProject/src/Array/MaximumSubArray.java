public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));
    }
}