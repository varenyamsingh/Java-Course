import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //for loop
        // for(int x=0; x<11; x++){
        //     System.out.println(x);
        // }

        //while loop
        // int x = 0;
        // while (x < 11){
        //     System.out.println(x);
        //     x++;
        //     }

        //do while loop
        // int x = 0;
        // do {
        //     System.out.println(x);
        //     x++;
        // }while(x < 11);

        //print sum of n natural number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        //print the table of a number by input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}
