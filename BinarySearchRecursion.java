import java.util.Arrays;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {4 , 6 , 12 , 16 , 22 };

        System.out.println("The given array : "+Arrays.toString(arr));

        int len = arr.length-1;
        int key = 2 ; 
        BinarySearchRecursion obj = new BinarySearchRecursion();
        
        int result = obj.binarySearch(arr , 0 , len , key );
        if(result > 0)
        System.out.println("the key value meet : "+result);
        else{
            System.out.println("the value not found in the array !");
        }
        
    }
    public  int binarySearch(int[] arr , int left , int right , int key){
        if(left <= right ){
            int mid = left + (right - left) / 2 ; 
            
            if(arr[mid] == key){
                return arr[mid];
            }
            if(arr[mid] > key ){
                return binarySearch(arr, left , mid - 1, key);
            }
            return binarySearch(arr, mid+1 , right, key);
        }
        return -1;


    }
    
}
