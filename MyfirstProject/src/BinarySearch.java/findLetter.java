public class findLetter {
    public static void main(String[] args) {
        //letters.
        int[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(findLetter(null, target));

    }

    // 4.Find smallest Letter Greater than target.
    // Input: letters = ['c', 'f','j'], target = 'a'
    // output : c

    public static char findLetter(char[] lettter, char target) {
        int start = 0;
        int end = lettter.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > lettter[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lettter[start % lettter.length];
    }

}
