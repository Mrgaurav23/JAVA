import java.util.Scanner;

public class function_practice {

    //1. Calculate Average of a 3 number.
    public static void calcAverage(int a, int b, int c) {
        int average = ((a + b + c) / 3);
        System.out.println("Average is:" + average);
        return;
    }

    //2. Calculate sum of Odd number.
    public static void calcOddSum(int n) {
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
        System.out.println("Sum of Odd number" + n + "=" + oddSum);
    }

    //3. Calculate gratest number of two number
    public static void graterNum(int a, int b) {
        if (a > b) {
            System.out.println("Greater number is" + a);
        } else {
            System.out.println("Greater number is" + b);
        }
    }

    //4. Calculate circumference of a circle 
    public static void COC(int radius) {
        double pi = 3.14;

        System.out.println("Circumference of a circle is :" + 2 * pi * radius);
    }

    //5. Check a person age to eligible to vote or not.
    public static void eligibleToVote(int age) {
        if (age > 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }

    //6. Calculate positive count and neagtive count of a number
    // Positive number count is:
    public static void countPosNeg(int data) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int positive = 0;
        int negative = 0;

        while (data != 0) {
            System.out.println("Enter 0 to end the program");
            data = scan.nextInt();

            if (data > 0) {
                positive++;
            }

            else if (data < 0) {
                negative++;
            }
            count++;
        }
        System.out.println(positive + " " + ":Positive number count");
        System.out.println(negative + " " + ":Negative number count");
    }

    //7. Calculate Power of a number
    public static int calcPower(int x, int n) {
        Scanner scan = new Scanner(System.in);

        int pow = 1;

        for (int i = 0; i < n; i++) {
            pow = pow * x;
        }
        return pow;
    }

    //8. Calculate a HCF of a number
    public static int calcGCD(int a, int b) { // GCD:Greatest Common Divisor.
        int i;
        if (a<b) {
            i = a;
        }
        else{
            i = b;
        }

        for(i=i; i>1; i--){
            if (a%i==0 && b%i==0) {
                return i;
            }
        }
        return 1;
    }


     //Calculate a fibonacci Series
     public static void calcFibonacci(int a,int b,int n) { 
        int sum;
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            sum = a+b;
            a=b;
            b=sum;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Calculate Average.
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter b:");
        int b = scan.nextInt();
        System.out.print("Enter c:");
        int c = scan.nextInt();

        calcAverage(a, b, c);

       
        // Sum of All Odd Numbers
        // System.out.print("Enter a number:");
        // int n = scan.nextInt();

        // calcOddSum(n);

   
        // GReater number of 2 numbers
        // System.out.println("Enter a:");
        // int a = scan.nextInt();
        // System.out.println("Enter b");
        // int b = scan.nextInt();

        // graterNum(a, b);

 
        // Circumfernce of a circle.
        // System.out.print("Enter radius:");
        // int radius = scan.nextInt();

        // COC(radius);


        // Voting eligibility
        // System.out.print("Enter Age:");
        // int age = scan.nextInt();

        // eligibleToVote(age);

        // Positive Negative count is:
        // System.out.print("Enter data :");
        // int data = scan.nextInt();

        // countPosNeg(data);


        // Calculate Power of a number
        // System.out.print("Enter any x:");
        // int x = scan.nextInt();
        // System.out.print("Enter any n:");
        // int n = scan.nextInt();
        // System.out.println("Power is:" + calcPower(x, n));

        // calcPower(x, n);


        //HCF of a number.
        // System.out.print("Enter number a:");
        // int a = scan.nextInt();

        // System.out.print("Enter number b:");
        // int b = scan.nextInt();

        // System.out.print("HCF is:" + calcGCD(a,b));

        //Fibonacci Series
        // int a=0;
        // int b=1;
        // System.out.print("Enter any number:");
        // int n = scan.nextInt();

        // calcFibonacci(a, b, n);
    }
}
