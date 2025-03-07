import java.util.*;

public class Ascending_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = scan.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < number.length - 1; i++) { // Notice numbers.length -1 as trmination condition
            if (number[i] > number[i + 1]) {
                isAscending = false;
            }

        }
        if (isAscending) {
            System.out.println("The Array is sorted in ascending order");
        } else {
            System.out.println("This Array is not sorted in ascending order");
        }
    }
}
