import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is :"+ name);

        //concatenation
        String firstname = "Tony ";
        String lastname = "Stark";
        String fullname = firstname + lastname;
        System.out.println(fullname.length());

        //charAt
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        //it tells us which which characters are present in our given string and return all those cahracters seperately
        }
    }
}
