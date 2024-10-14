public class linearCountEven {

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    // 6.count even number in an array.
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num) {
        int numberdigts = digits(num);

        if (numberdigts % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;

            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,12,345,4376,23,21};

        int ans = findNumbers(nums);
        System.out.println("Even count in array is:" + ans);
    }
}