public class BinarySearch {
    public static int binaryTree(int number[] , int key){
        int start = 0;
        int end = number.length;
        while (start <= end) {
        int mid = (start+end)/2;
            if(number[mid] == key){ // when mid == key 
                return mid;
            }
            if(number[mid] < key){ // when mid < key
                start  = mid+1;
            }else{
                end = mid-1; // mid > key
            }   
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1 ,2 ,3 ,14 ,5 ,6, 7};
        int key = 1;
        if(binaryTree(number, key) == -1){
            System.out.println("You choose wrong number");
        }else{
            System.out.println("The Index of the number is : "+binaryTree(number, key));
        }
        
    }

    
}