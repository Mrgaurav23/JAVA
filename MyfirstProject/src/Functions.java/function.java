import java.util.*;

public class function {

    // PrintName
    public static void printMyName(String name) {

        System.out.println(name);
        return;
    }

    // Sum
    public static int calSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Product
    public static int calcProduct(int a, int b) {
        return a * b;
    }

    // Factorial
    public static void calFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid value");
            return;
        }
        int factorial = 1;
        // loop
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is:" + factorial);
        return;
    }

    //Print Table
    public static void calcTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + "X"+  i  + "=" + n*i);
        }
    }

    //Even Odd
    public static void checkOddEven(int n){
        if (n % 2 == 0 ) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    //HCF LCM
    public static void HcfLcm(int a,int b){
        int temp = 0;
        for(int i=1; i<=a; i++){
            if (a % i == 0 && b % i == 0) {
                temp = i;
            }
        }
        System.out.println("HCF is :" + temp);
        int lcm = a * b / temp;
        System.out.println("LCM is:" + lcm);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    
        // String name = scan.nextLine();
        // printMyName(name);

        System.out.println("Enter number a:");
        int a = scan.nextInt();
        System.out.println("Enter number b:");
        int b = scan.nextInt();

        // System.out.print("Enter a Number:");
        // int n = scan.nextInt();

        // CalSum return Function
        // int sum = calSum(a, b);
        // System.out.println("Sum is:" + sum );

        // calcProduct
        // System.out.println("Product is" + calcProduct(a,b));

        // calcFact
        // calFactorial(n);

        // Factorial input
        // System.out.print("Enter number n:");
        // int n = scan.nextInt();

        //calcTable
        // calcTable(n);

        //Even Odd
        // checkOddEven(n);

        //LCM/HCF
        // HcfLcm(a, b);
    }
}