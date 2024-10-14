public class linearMinimum {
     // 3. Find minimum value in an array.
     public static int searchMinimum(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for (int index = 0; index < arr.length; index++) {
            // here traverse all array and compare value.
            if (arr[index] < min) {
                // Shift value of minimum to arr[0].
                min = arr[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {20,40,32,80,12};

        int ans = searchMinimum(arr);
        System.out.println("Minimun element is:" + ans);
    }
}
