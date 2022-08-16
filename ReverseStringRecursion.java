public class ReverseStringRecursion {
    public void reverse_String(String str){
        if( (str==null) || (str.length() <= 1) ){
            System.out.print(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            reverse_String(str.substring( 0, str.length()-1) );
        }

    }
    public static void main(String[] args) {
        String str = "naman";
        System.out.println("The given string is : "+ str);

        ReverseStringRecursion obj = new ReverseStringRecursion();
        System.out.println("After reversing the string is : ");

        obj.reverse_String(str);


    }

    
}
