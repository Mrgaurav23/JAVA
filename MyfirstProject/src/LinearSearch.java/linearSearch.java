public class linearSearch {
    // 1. Search element in the array.
    public static boolean searchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            // Here index value insert in element
            int element = arr[index];
            // // check value is present in array or not
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {23,999,8,9564};
        int target = 8;

        //Search
        boolean ans = searchElement(arr, target);
        System.out.println("Element found at index:" + " " + ans);
    }
}
