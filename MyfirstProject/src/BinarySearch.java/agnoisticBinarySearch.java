public class agnoisticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;

        int ans = agnoisticBinarySearch(arr, target);
        System.out.println("Element at index:" + ans);

    }

    static int agnoisticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        //This condition is used to check array is ascending order or not.
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
