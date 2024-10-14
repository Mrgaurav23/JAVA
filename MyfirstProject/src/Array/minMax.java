import java.util.Scanner;

public class minMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // minmax number
        int size = scan.nextInt();
        int numbers[] = new int[size];

        minMax(size, numbers);
    }


    // 3. Write an array to find max and min of a number.
    public static void minMax(int size, int numbers[]) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length;i++) {
            if (numbers[i] > min) {
                min = numbers[i];
            }
            if (numbers[i] < max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is:" + " " + min);
        System.out.println("Smallest number is:" + " " + max);
    }

}
