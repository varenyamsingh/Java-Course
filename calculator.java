import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2= sc.nextDouble();
        System.out.println("Enter the operation: +, -, /, *");
        char operator = sc.next().charAt(0);
        if (operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if(operator == '/'){
            System.out.println(num1 / num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else{
            System.out.println("You entered wrong operator");
        }
        
    }
}
