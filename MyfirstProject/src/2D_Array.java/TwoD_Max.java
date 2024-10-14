public class TwoD_Max {
    public static void main(String[] args) {
        int arr[][] = {
                { 23, 4, 1 },
                { 18, 12, 5, 8 },
                { 94, 23 },
                { 8, 8, 12, 14, 8 }
        };

        // Maximum value of an array.
        System.out.println(maxElement(arr));
    }

    //Maximum value in an 2D array.
    public static int maxElement(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
