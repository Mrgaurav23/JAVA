class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int multiplyAll = 1, countZeroes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                countZeroes++;
            } else {
                multiplyAll *= nums[i];
            }
        }
        if (countZeroes == 0) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    nums[i] = multiplyAll / nums[i];
                }
            }
        } else if (countZeroes == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    nums[i] = multiplyAll;
                } else {
                    nums[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}