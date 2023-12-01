import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        //printing the rectangle of stars/patterns 4x4
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //now printing the hollow rectangle of stars/patterns
        //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++){
        //         if(i == 1 || j ==1 || i == n || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //now printing the half pyramid of stars/patterns
        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // now printing the reverse half pyramid of stars/patterns
        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        //     // inner loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //now printing the inverted half pyramid rotated by 180 degrees of stars/patterns
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //now printing the patterns of numbers of half pyramid
        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //now printing the reverse half pyramid of numbersint n = 5;
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
