public class recursion1 {

    public static void PrintNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        PrintNum(n);//n=5 
    }
}
//above printing numbers 5 to 1
//for printing 1 to 5 we need to change the - sign to + and 0 to 6 and 5 to 0


