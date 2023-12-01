import java.util.Scanner;

public class functions {
    //printing the name 
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
    //     printMyName(name);
    // }

    //Now add two numbers and return the sum
    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a, b);
    //     System.out.println("Sum of two number is "+ sum);
        //same code will be for multiply and divide and subtract just change the signs of operations and some minor changes more.
    // }

    // Now finding factorial of a number
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
