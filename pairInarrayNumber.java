public class pairInarrayNumber {
    public static void pairInNumber(int number[]){
        int tp = 0;
        int currentNumber;
        for(int i=0; i<number.length; i++){
            currentNumber = number[i];

            for(int j=i+1; j<number.length; j++){
             
                    System.out.print("( "+currentNumber+" , "+ number[j]+" ) ");
                    tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair ="+ tp);
    }
    public static void main(String[] args) {
        int number[] = {1 ,2 , 4 , 5, 6,7};
        pairInNumber(number);
        
    }
    
}
//Most Important question as as interviewer
// find the total pair 
// formula is n(n-1)/2 finding the total pair given in array