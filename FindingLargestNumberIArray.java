public class FindingLargestNumberIArray {

    public static int largestNumber(int number[]){
        int largeNumber = Integer.MIN_VALUE;  //-infinity
        for(int i =0; i<number.length; i++){
            if(number[i] > largeNumber){
                largeNumber = number[i];
               
            }

        }
        return largeNumber;
        
    }

    public static int smallestNumbet(int number[]){
        int smallestNumbet = Integer.MAX_VALUE; // +infinity

        for(int i = 0; i< number.length; i++){
            if(smallestNumbet > number[i]){
                smallestNumbet = number[i];
            }
        }
        return smallestNumbet;

    }
    public static void main(String[] args) {
        int number[] = {10 , 20, 50 , 30 , 5};
       System.out.println(largestNumber(number));
       System.out.println(smallestNumbet(number));
    }
    
}
