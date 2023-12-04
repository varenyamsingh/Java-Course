public class comparestring {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";
        //compare 
        //s1>s2 :+ve value
        //s1==s2 : 0
        //s1<s2 :-ve value
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //substring
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
 
    }
}
