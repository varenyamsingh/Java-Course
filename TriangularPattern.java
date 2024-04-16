import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printing pyramid of numbers
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // printing pyramid of numbers in reverse order
        // for(int i=1; i<=n; i++){
        //     int startingNumber = i;
        //     for(int j=1; j<=i; j++){
        //         System.out.print(startingNumber);
        //         startingNumber++;
        //     }
        //     System.out.println();
        // }

        // printing pyramid of numbers with continuous words
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
