public class rotationcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};

        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int search(int[] arr, int target){
        int pivot = findPivotDuplicate(arr);

        if (pivot == -1) {
            return binarySearch(arr, target,0,arr.length-1);
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot);
        }
        return binarySearch(arr, target, pivot + 1, arr.length-1);
    }

    static int findPivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            //case 1
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates.
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                               
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check wheather end is pivot or not
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }


    //Here we find pivot.
    // this will not work in duplicate values.
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid  = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element.
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java.
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

}
