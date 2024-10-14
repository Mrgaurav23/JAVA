import java.util.*;

public class kunalFunction {

    
    // 1.Define two methods to print the maximum and the minimum number respectively
    // among three numbers entered by the user.
    public static void largestNum(int a, int b, int c) {
        if (a > b) {
            System.out.println("largest number is:" + a);
        } else if (b > c) {
            System.out.println("largest number is:" + b);
        } else if (a > c) {
            System.out.println("largest number is:" + c);
        } else {
            System.out.println("Invalid number");
        }
    }
    
    // 2.Define a program to find out whether a given number is even or odd.
    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }
    
    // 3. A person is eligible to vote if his/her age is greater than or equal to
    // 18. Define a method to find out if he/she is eligible to vote.
    public static void eligibleVote(int age) {
        if (age > 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible voter");
        }
    }
    
    // 4. Write a program to print the sum of two numbers entered by user by
    // defining your own method.
    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println(" Sum is:" + sum);
        return sum;
    }
    
    // 5. Define a method that returns the product of two numbers entered by user.
    public static int product(int a, int b) {
        int product = a * b;
        System.out.println("Product is:" + product);
        return product;
    }
    
    // 6. Write a program to print the circumference and area of a circle of radius
    // entered by user by defining your own method.
    public static double COC(int radius) {
        double COC = 2 * 3.14 * radius;
        System.out.println("Circumference of circle is: " + COC);
        return COC;
    }
    
    // 7. Define a method to find out if a number is prime or not.
    public static void primeNum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
    
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime number");
        }
    }
    
    //Print Grade of a student.
    public static void printGrade(int num){
        if (num>=90&&num<=100) {
            System.out.println("Pass: A+");
        }
        if (num>=75&&num<=89) {
            System.out.println("Pass: A");
        }
        if (num>=51&&num<=74) {
            System.out.println("Pass: B");
        }
        if (num>=34&&num<=50) {
            System.out.println("Pass: C");
        }
    
        if (num>=0&&num<=33) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Number");
        }
        
    }
    
    //8. Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void is_palindrome(int num)
    {
        int c , r , s=0;
        c = num ;
        while(num > 0){
            r = num % 10;
            s = (s * 10) + r;
            num = num/10;
        }
        if(c == s){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // largest number
        // System.out.println("Enter a:");
        // int a = scan.nextInt();
        // System.out.println("Enter b:");
        // int b = scan.nextInt();
        // System.out.println("Enter c:");
        // int c = scan.nextInt();
    
        // largestNum(a, b, c);
    
        // Even Odd
        System.out.println("Enter number:");
        int num = scan.nextInt();
        // evenOdd(num);
        // primeNum(num);
    
        // Eligible voter
        // int age = scan.nextInt();
        // eligibleVote(age);
    
        // Sum
        // sum(23, 27);
    
        // product
        // product(5, 10);
    
        // circumfernce of circle
        // COC(6);
    
        // primeNum(num);
        // printGrade(num);
    
        is_palindrome(num);
    }
}

