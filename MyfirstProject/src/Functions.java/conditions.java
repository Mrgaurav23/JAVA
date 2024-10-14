import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // areaOfCircle(8);
        // areaOfTraingle(8,4);
        // areaOfRectangle(6,7);
        // calcEqTraingle(8);
        // calcFibbonacci(num);
        // calcSumProdSubs(num);
        // calcFactor(25);
        // sumOfAll(0);
        // factorial(num);
        System.out.println( " Electricity bill is:" + electricityBill(60,50,10));
    }

    // 1. Area of Circle.juy
    public static double areaOfCircle(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println(area);
        return area;
    }

    // 2. Area of Traingle.
    public static double areaOfTraingle(int base, int height) {
        double traingle = (0.5 * base * height);
        System.out.println(traingle);
        return traingle;
    }

    // 3 Area of rectangle.
    public static int areaOfRectangle(int length, int breath) {
        int rectangle = length * breath;
        System.out.println(rectangle);
        return rectangle;
    }

    // 4. Area of equalateral traingle.
    public static double calcEqTraingle(int side) {
        double eqTraingle = 0.86 * side * 2;
        System.out.println(eqTraingle);
        return eqTraingle;
    }

    // 5. Fibbonacci series
    public static void calcFibbonacci(int num) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            // swap
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
        }
    }

    // 6.Subtract the Product and Sum of Digits of an Integer
    public static void calcSumProdSubs(int num) {
        int Product = 1;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            Product = Product * rem;
            sum = sum + rem;
            num = num / 10;
        }
        int Subtract = Product - sum;
        System.out.println(Subtract);
    }

    // 7.Input a number and print all the factors of that number (use loops).
    public static int calcFactor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        return num;
    }

    // 8.Take integer inputs till the user enters 0 and print the sum of all
    // numbers.
    public static void sumOfAll(int num) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            num = scan.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum of all numbers is:" + sum);
    }

    //9.  Factorial Program In Java
    public static void factorial(int num){
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of a "+ num + " is" + fact);
    }

    //10. Calculate Electricity Bill
    public static int electricityBill(int curr, int prev , int rupee){
        return ((curr - prev)*rupee) ;
    }
}
