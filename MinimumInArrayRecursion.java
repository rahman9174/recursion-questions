import java.util.Arrays;

public class MinimumInArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {7 , 32 , 64 , 2 , 10 , 23 , 0 , -1 , 1 , -2};

        System.out.println("The given array is : "+ Arrays.toString(arr) );
        System.out.println(" The minimum number in the given array is : ");
        
        int length = arr.length;

        int result = getMin(arr , 0 , length);
        System.out.println("The minimum number in the given array is : "+result);
    }
    public static int  getMin(int[] arr , int start , int length ){
        return (length == 1 ) ? arr[start] : Math.min(arr[start] , getMin(arr, start+1, length-1 ) );
        
    }
    
}
