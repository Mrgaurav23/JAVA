import java.util.Arrays;

public class TwoD_Search {

    public static void main(String[] args) {
        int arr[][] = {
                { 23, 4, 1 },
                { 18, 12, 5, 8 },
                { 94, 23 },
                { 8, 8, 12, 14, 8 }
        };

        int target = 8;

        // SearchElement
        int[] ans = searchElement(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    // 1. Search element in an array.
    public static int[] searchElement(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
