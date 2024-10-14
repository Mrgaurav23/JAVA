public class searchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,7,5,3,2};
        int target = 8;

        System.out.println(searchInMountain(arr, target, 0, arr.length-1));
    }

    // https://leetcode.com/problems/find-in-mountain-array/

    static int searchInMountain(int[] arr,int target,int start, int end){
        int peek = peekMountain(arr);

        int firstTry = agnoisticBinarySearch(arr, target, start, peek);
        if (firstTry != -1) {
            return firstTry;
        }
        //try to search in second Half
        return agnoisticBinarySearch(arr, target, peek + 1, arr.length - 1);
    }

    static int peekMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int agnoisticBinarySearch(int[] arr,int target,int start,int end){
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
