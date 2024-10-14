public class RBSDuplicate {

    public static void main(String[] args) {
        int[] arr = {5,5,6,1,2,3,4,5,};
        int target = 2;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr,int target){
        int pivot = findPivotwithDuplicate(arr);

        if (pivot == -1) {
            return Binary(arr, target, 0, arr.length-1);
        }
        if (target >= arr[0]) {
            return Binary(arr, target, 0, pivot -1 );
        }
        return Binary(arr, target, pivot + 1, arr.length-1);
    }

    static int findPivotwithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // case 2
            if (start < end && arr[mid] < arr[mid + 1]) {
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
            if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] > arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
    static int Binary(int[] arr, int target,int start, int end){
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