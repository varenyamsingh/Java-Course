public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony ");
        System.out.println(sb);
        //char at 0
        System.out.println(sb.charAt(0));
        //set char at 0
        // sb.setCharAt(0, 'M');
        // System.out.println(sb);

        //insert:this adds an extra character at the specific index we want
        sb.insert(2, 'N');
        System.out.println(sb);

        //deleting the extra N from above code
        sb.delete(2, 3);
        System.out.println(sb);

        //Append: adding any char at last of string
        sb.append('H');
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb.length());
        System.out.println(sb.reverse());//reverses the characters of whole string
    }
}

