public class linearSearchchar {
    // 5.Search Element in an Array.
    public static boolean searchchar(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Search Char.
        String name = "Gaurav Sisodiya";
        char target = 'k';

        boolean ans = searchchar(name, target);
        System.out.println("Character present in an array: " + ans);
    }
}
