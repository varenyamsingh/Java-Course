import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        //int[] marks = new int[3]; //big brackets chahe marks k aage aaye ya peeche isse koi fark nhi padta
        // int marks[] = {98, 87, 88, 89};
        // marks[0] = 97;
        // marks[1] = 86;
        // marks[2] = 84;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // one way is this to do it line by line but fro bigger codes it will not work so we will use loop
        // for(int i=0; i<4; i++){
        //     System.out.println(marks[i]);
            // hum ye use karenge toh effecient hoga kyuki hum isme conditions use kar rahe hai ki kab exit hona hai code se or kaha tak jana hai or start kaun se index se hona hai...
        //}

        //now making array by taking input from user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        //pehle hum input denge ki kitne numbers humare output me aane chahiye i.e. 5 or fir hume vo 5  numbers dene hai ki kaunx kaun se aane chahiye 1, 2, 3, 4, 5
        int x = sc.nextInt();
        //output
        for(int i=0; i</*size*/numbers.length; i++){//size or numbers.length dono same hi hai bas .length lagana hai
            if(numbers[i] == x){
                System.out.println("x found at index :" + i);
            }//this searching method is called linear search jab hume koi word find karna hota hai humare array se
        }
    }
}
