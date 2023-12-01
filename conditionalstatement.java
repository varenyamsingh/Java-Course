import java.util.Scanner;

public class conditionalstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age > 18){
        //     System.out.println("Adult");
        // }else {
        //     System.out.println("Not Adult");
        // }
        
        //number is even or odd
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // if(a == b){
        //     System.out.println("Equal");
        // }
        // else if(a > b){
        //     System.out.println("a is greater than b");
        // }
        // else {
        //     System.out.println("a is less than b");
        // }
        
    }
}
