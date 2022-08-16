public class CountRecursion {
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println("The given value is : "+n);
        System.out.println("The count value are as follows : ");
        CountRecursion obj = new CountRecursion();
        obj.countRecursion(n);
    }
    public void countRecursion(int n){
        if( n == 0)
        System.out.print(n+" ");
        else{
            System.out.print(n+" ");
            countRecursion(n-1);
        }
    }
    
}
