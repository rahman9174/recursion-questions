public class FabonacciRecursion {
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println("Fabonacci series of first 10 numnbers : ");
        for(int i = 1 ; i <= n ; i++){
            System.out.print(fabonacci(i)+" ");
        }
       
    }
    public static int fabonacci(int n){
        if(n <= 1){
            return n;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
      

    }
        
}
    

