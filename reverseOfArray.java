/**
 * reverseOfArray
 */
public class reverseOfArray {

    public static void reverse(int number[]){
        int start = 0;
        int end = number.length-1;
        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[] = {1,2,4,5,6,7,8,9};
        reverse(number);

        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
        
    }
}