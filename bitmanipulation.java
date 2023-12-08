public class bitmanipulation {
    public static void main(String[] args) {
        //get bit: we'll get the bit(0,1) in the specific position
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;// <<this sign represents the direction to move our bits 
    //     if((bitMask & n) == 0){
    //         System.out.println("Bit was zero");
    //     }else{
    //         System.out.println("bit was one");
    //     }

    //set bit
    // int  newNumber = bitMask | n;
    // System.out.println(newNumber);

    //clear bit
    //clear the 3rd bit(position=2nd) of a number n=0101
    int notBitmask = ~(bitMask);
    int newNumber = notBitmask & n;
    System.out.println(newNumber);
    }
}

