public class peekIndexMountain {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 3, 2, 1 };

        System.out.println(peekMountain(nums));
    }

    // https://leetcode.com/problems/find-in-mountain-array/
    static int peekMountain(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                //you are decending part of array.
                //this may be the ans, but may look ata the left
                //this is why end != mid - 1.
                end = mid;
            } else {
                //you are in ascending part of array
                start = mid + 1;//because we know the mid + 1 element > mid element
            }
        }
        
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans// in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        return start;
    }

}
