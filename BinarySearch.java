/**
 * BinarySearch
 */
public class BinarySearch {

    public static  int BinarySearchInArray(int number[],int key){
        int start= 0;
        int end = number.length-1;
        while (start <= end) {
        int mid = (start+end)/2;

        if(number[mid] ==key ){
            return mid;
        }
        if(number[mid] < key){//left side
            return mid+1;
        }

            
        }
        
    }
}