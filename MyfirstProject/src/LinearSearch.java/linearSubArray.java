public class linearSubArray {
    // 2. Find element from subarray in array.
    public static int searchElementSubArray(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {23,999,8,9564,12};
        int target = 8;

        //SubArraySearch
        int ans = searchElementSubArray(arr,target,3,4);
        System.out.println(ans);
    }
}
