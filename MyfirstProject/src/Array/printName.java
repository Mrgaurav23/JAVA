import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        String names[] = new String[size];

        printName(size, names);
    }

    // 2. Print the name in the array.
    public static void printName(int size, String names[]) {
        Scanner scan = new Scanner(System.in);
        // input
        for (int i = 0; i < size; i++) {
            names[i] = scan.next();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
    }
}
